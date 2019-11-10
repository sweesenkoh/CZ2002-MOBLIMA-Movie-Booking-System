package View;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.TicketPriceManager;
import Controller.ViewNavigator;
import Model.*;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class BookingPuchaseTicketView extends View {

    private ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Confirm",
            "Back to Previous Seat Selection Page to reselect seat",
            "Cancel and back to main menu"
    ));
    private String title = "Purchasing Ticket";
    private String viewContent = "";
    ArrayList<Ticket> createdTickets;

    private ArrayList<Seat> selectedSeats;
    private Showtime selectedShowtime;

    public BookingPuchaseTicketView(ArrayList<Seat> selectedSeats, Showtime selectedShowtime){
        this.selectedSeats = selectedSeats;
        this.selectedShowtime = selectedShowtime;
    }


    @Override
    public void activate() {
        super.setTitle(this.title);
        super.setViewContent(this.viewContent);
        super.activate();

        int ticketCount = 0;
        createdTickets = new ArrayList<>();
        int adultCount;
        int childCount;
        int seniorCitizenCount;

        while (true){
            adultCount = 0;
            childCount = 0;
            seniorCitizenCount = 0;
            adultCount = IOManager.getUserInputInt("How many adults? ");
            ticketCount += adultCount; if (ticketCount == selectedSeats.size()) break;
            childCount = IOManager.getUserInputInt("How many children? ");
            ticketCount += childCount; if (ticketCount == selectedSeats.size()) break;
            seniorCitizenCount = IOManager.getUserInputInt("How many senior citizen");
            ticketCount += seniorCitizenCount; if (ticketCount == selectedSeats.size()) break;

            System.out.printf("The total number of people (%d) does not tally with the number of selected seats (%d), please try again\n",ticketCount,selectedSeats.size());
            ticketCount = 0;
            continue;
        }

        for (Seat seat : this.selectedSeats){
            if (adultCount != 0){
                createdTickets.add(new Ticket(seat,this.selectedShowtime, TicketType.ADULT));
                adultCount--;
            }

            else if (childCount != 0){
                createdTickets.add(new Ticket(seat,this.selectedShowtime, TicketType.CHILD));
                childCount--;
            }

            else if (seniorCitizenCount != 0){
                createdTickets.add(new Ticket(seat,this.selectedShowtime, TicketType.SENIORCITIZEN));
                seniorCitizenCount--;
            }
        }

        System.out.println("\nHere is your order: \n");

//        for (Ticket ticket : createdTickets){
//            System.out.println(ticket.toString());
//        }


        String returnString = "";

        returnString += "---------------------------------------------\n";
        returnString += "                      Order                  \n";
        returnString += "---------------------------------------------\n";

        returnString += "Tickets: \n\n";
        double totalPrice = 0.0;
        for (Ticket ticket : createdTickets){
            returnString += ticket.toString() + "\n";
            totalPrice += ticket.getPrice();
        }

        returnString += String.format("Total Price Before GST : $%.2f\n",totalPrice);
        double priceAfterGST = TicketPriceManager.applyGSTFactor(totalPrice);
        returnString += String.format("GST : $%.2f\n",priceAfterGST - totalPrice);
        returnString += String.format("Total Price: $%.2f",priceAfterGST);

        returnString += "\n---------------------------------------------\n";

        System.out.println(returnString);

        IOManager.printMenuOptions(this.options);

        int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
        processUserInput(userInput);
    }

    @Override
    protected void processUserInput(int input) {

        if (input == 2){
            ViewNavigator.popView();
        }

        else if (input == 3){
            ViewNavigator.popViews(8);
        }

        else if (input == 1){
            String buyerName = IOManager.getUserInputString("Please input your name: ");
            String emailAddress = IOManager.getUserInputString("Please input your email address: ");
            Order order = new Order(createdTickets,buyerName,emailAddress);
            System.out.println("Bought Successfully");
            //save to database

            for (Ticket ticket : createdTickets){
                ticket.getShowtime().getSeatLayout().getSeat(ticket.getSeat().getRow(),ticket.getSeat().getCol()).bookSeat();
            }

            Cineplex cineplex = this.createdTickets.get(0).getShowtime().getCinema().getCineplex();
            DatabaseManager.updateCineplexValues(cineplex);
            DatabaseManager.saveNewOrder(order);
            System.out.println(order.toString());
            IOManager.getUserInputString("Please take a photo of this order to be used for verification\nEnter any key to go back to main menu");
            ViewNavigator.popToBaseView();
        }

    }


}
