package View;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Seat;
import Model.Showtime;

import java.util.ArrayList;
import java.util.Arrays;

public class BookingSeatSelectionView extends View {


    private ArrayList<String> options = new ArrayList<>();
    private String title = "Seat Selection";
    private String viewContent = "       ";
    private Showtime showtime;
    private ArrayList<Seat> chosenSeats = new ArrayList<>();

    public BookingSeatSelectionView(Showtime showtime){
        this.showtime = showtime;
        this.viewContent += this.showtime.toString();
    }

    @Override
    public void activate() {
        super.setTitle(this.title);
        super.activate();
        System.out.println(this.viewContent);
        this.chosenSeats.clear();
        this.options.clear();
        this.showtime.getSeatLayout().printSeatLayout();

        options.add("Book Seat");
        options.add("Back to Previous Page");
        IOManager.printMenuOptions(options);
        int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
        processUserInput(userInput);
    }


    @Override
    protected void processUserInput(int input) {
        if (input == options.size()){
            ViewNavigator.popView();
        }else{
            this.handleBookSeat();
        }
    }

    private void handleBookSeat(){

        int row;
        int col;
        int userProceedChoice;

        while (true){
            try{
                System.out.println("Please enter the seat number: Eg (A6) means row 1 column 6");
                String userChosenSeat = IOManager.getUserInputString("");
                row = Character.toLowerCase(userChosenSeat.substring(0,1).toCharArray()[0])  - 'a';
                col = Integer.parseInt(userChosenSeat.substring(1,userChosenSeat.length() >= 3 ? 3 : 2)) - 1;

            }catch (Exception e){
                System.out.println("Wrong format, try again\n");
                continue;
            }

            if ((col>=showtime.getSeatLayout().getNumOfColumns())||(row >= showtime.getSeatLayout().getNumOfRows())||(col<0)||(row<0)){
                System.out.println("The seat does not exist, please input again");
                continue;
            }

            if ((showtime.getSeatLayout().getSeat(row,col) != null)) {

                if (showtime.getSeatLayout().getSeat(row,col).isBooked()){
                    System.out.println("The seat is already book, input another seat");
                    continue;
                }else{
                    showtime.getSeatLayout().getSeat(row,col).bookSeat();
                    this.chosenSeats.add(new Seat(row,col));
                }

            }else{
                System.out.println("The seat is not among the choices");
                continue;
            }

            showtime.getSeatLayout().printSeatLayout();

            ArrayList<String> choices = new ArrayList<>();
            choices.add("Add more seat");
            choices.add("Undo previous seat selection");
            choices.add("Proceed to next step");
            choices.add("Cancel and back to previous page");

            IOManager.printMenuOptions(choices);
            userProceedChoice = IOManager.getUserInputInt("Please input a choice",1,choices.size());

            if (userProceedChoice == 1){
                continue;
            }else if (userProceedChoice == 2){
                if (this.chosenSeats.size() < 1){
                    System.out.println("Cannot unbook seat, you do not have any previous selection");
                    continue;
                }
                Seat lastChosenSeat = this.chosenSeats.get(chosenSeats.size() - 1);
                showtime.getSeatLayout().getSeat(lastChosenSeat.getRow(),lastChosenSeat.getCol()).unbookSeat();
                this.chosenSeats.remove(chosenSeats.size() - 1);
                System.out.println("Removed!");
                showtime.getSeatLayout().printSeatLayout();
                continue;
            }
            else break;
        }

        if (userProceedChoice == 4){
            //this step is to unbook all the booked seats
            for (Seat seat:this.chosenSeats){
                showtime.getSeatLayout().getSeat(seat.getRow(),seat.getCol()).unbookSeat();
            }
            this.chosenSeats.clear();
            ViewNavigator.popView();

        }else if (userProceedChoice == 3){
            for (Seat seat:this.chosenSeats){
                showtime.getSeatLayout().getSeat(seat.getRow(),seat.getCol()).unbookSeat();
            }
            ViewNavigator.pushView(new BookingPuchaseTicketView(this.chosenSeats,this.showtime));
        }




    }
}
