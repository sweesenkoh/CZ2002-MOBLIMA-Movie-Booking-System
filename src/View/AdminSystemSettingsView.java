package View;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.PublicHoliday;

import java.util.ArrayList;
import java.util.Arrays;

public class AdminSystemSettingsView extends View {

//
//    private ArrayList<PublicHoliday> publicHolidays = new ArrayList<>();
//
//    private double basePrice = 9;
//    private double platinumBasePrice = 15;
//    private double goldBasePrice = 20;
//
//    private double weekendIncrement = 3;
//    private double publicHolidayIncrement = 6;
//
//    private double threeDMovieIncrement = 3;
//    private double blockbusterMovieIncrement = 5;
//
//
//    private double childPercentageOff = 0.5;
//    private double seniorCitizenPercentageOff = 0.6;
//
//    private double gstPercentageIncrease = 0.07;

    private ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Set Public Holidays",
            "Base Ticket Price",
            "Base Platinum Class Ticket Price",
            "Base Gold Class Ticket Price",
            "Weekend Price Increment",
            "Public Holiday Price Increment",
            "3D Movie Price Increment",
            "Blockbuster Movie Price Increment",
            "Child Ticket Percentage Discount",
            "Senior Citizen Ticket Percentage Discount",
            "GST Percentage Increase",
            "Back to Previous Page"
    ));


    private String title = "Admin Configuring System Settings";
    private String viewContent = "Here are the options for you to configure: ";


    @Override
    public void activate() {

        super.setOptions(this.options);
        super.setTitle(this.title);
        super.setViewContent(this.viewContent);
        super.activate();

        int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
        processUserInput(userInput);
    }

    @Override
    protected void processUserInput(int input) {

        switch (input){
            case 1:
                this.handleSetPublicHoliday();
            case 2:
                this.handleSetBaseTicketPrice();
            case 3:
                this.handleSetBasePlatinumTicketPrice();
            case 4:
                this.handleSetBaseGoldTicketPrice();
            case 5:
                this.handleSetWeekendPriceIncrement();
            case 6:
                this.handleSetPHPriceIncrement();
            case 7:
                this.handleSet3DPriceIncrement();
            case 8:
                this.handleSetBlockbusterPriceIncrement();
            case 9:
                this.handleSetChildTicketPercentageDiscount();
            case 10:
                this.handleSetSCTicketPercentageDiscount();
            case 11:
                this.handleSetGSTPercentageIncrease();
            default:
                ViewNavigator.popView();
        }
    }

    private void handleSetPublicHoliday(){

    }

    private void handleSetBaseTicketPrice(){

    }

    private void handleSetBasePlatinumTicketPrice(){

    }

    private void handleSetBaseGoldTicketPrice(){

    }

    private void handleSetWeekendPriceIncrement(){

    }

    private void handleSetPHPriceIncrement(){

    }

    private void handleSet3DPriceIncrement(){

    }

    private void handleSetBlockbusterPriceIncrement(){

    }

    private void handleSetChildTicketPercentageDiscount(){

    }

    private void handleSetSCTicketPercentageDiscount(){

    }

    private void handleSetGSTPercentageIncrease(){

    }
}
