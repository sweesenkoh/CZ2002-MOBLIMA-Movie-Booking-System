package View;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.PriceConfiguration;
import Model.PublicHoliday;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

        ViewNavigator.pushView(new AdminConfigurePublicHolidayView());

    }

    private void handleSetBaseTicketPrice(){

        System.out.printf("Current Base Price: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getBasePrice(),2);
        System.out.printf("\n");
        double userInput = IOManager.getUserInputDouble("What is the new base price that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setBasePrice(roundedInput);
        DatabaseManager.savePriceConfiguration(PriceConfiguration.getInstance());
        System.out.printf("Saved! Here is the new base price: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getBasePrice(),2);
        System.out.printf("\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();

    }

    private void handleSetBasePlatinumTicketPrice(){

        System.out.printf("Current Base Platinum Price: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getPlatinumBasePrice(),2);
        System.out.printf(" \n");
        double userInput = IOManager.getUserInputDouble("What is the new base platinum price that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setPlatinumBasePrice(roundedInput);
        System.out.printf("Saved! Here is the new base platinum price: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getPlatinumBasePrice(),2);
        System.out.printf("\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetBaseGoldTicketPrice(){

        System.out.printf("Current Gold Platinum Price: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getGoldBasePrice(),2);
        System.out.printf("\n");
        double userInput = IOManager.getUserInputDouble("What is the new base gold class price that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setGoldBasePrice(roundedInput);
        System.out.printf("Saved! Here is the new base gold price: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getGoldBasePrice(),2);
        System.out.printf("\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetWeekendPriceIncrement(){
        System.out.printf("Current Weekend Price Increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getWeekendIncrement(),2);
        System.out.printf("\n");
        double userInput = IOManager.getUserInputDouble("What is the new weekend price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setWeekendIncrement(roundedInput);
        System.out.printf("Saved! Here is the new weekend price increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getWeekendIncrement(),2);
        System.out.printf("\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetPHPriceIncrement(){
        System.out.printf("Current Public Holiday Price Increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getPublicHolidayIncrement(),2);
        System.out.printf("\n");
        double userInput = IOManager.getUserInputDouble("What is the new public holiday price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setPublicHolidayIncrement(roundedInput);
        System.out.printf("Saved! Here is the new public holiday price increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getPublicHolidayIncrement(),2);
        System.out.printf("\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSet3DPriceIncrement(){
        System.out.printf("Current 3D Price Increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getThreeDMovieIncrement(),2);
        System.out.printf("\n");
        double userInput = IOManager.getUserInputDouble("What is the new 3D price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setThreeDMovieIncrement(roundedInput);
        System.out.printf("Saved! Here is the new 3D price increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getThreeDMovieIncrement(),2);
        System.out.printf("\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();

    }

    private void handleSetBlockbusterPriceIncrement(){
        System.out.printf("Current Blockbuster Movie Price Increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getBlockbusterMovieIncrement(),2);
        System.out.printf("\n");
        double userInput = IOManager.getUserInputDouble("What is the new 3D price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setBlockbusterMovieIncrement(roundedInput);
        System.out.printf("Saved! Here is the new blockbuster movie price increment: $");
        IOManager.printDouble(PriceConfiguration.getInstance().getBlockbusterMovieIncrement(),2);
        System.out.printf("\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetChildTicketPercentageDiscount(){
        System.out.printf("Current Child Ticket Percentage Off: ");
        IOManager.printDouble((1 - PriceConfiguration.getInstance().getChildPercentageOff()) * 100,2);
        System.out.printf("%% \n");
        double userInput = IOManager.getUserInputDouble("What is the new child ticket percentage off that you want to set? (from 0 to 100) example: 20 for 20% discount for child ticket",0,100);
        BigDecimal bd = new BigDecimal((100 - userInput) / 100).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setChildPercentageOff(roundedInput);
        System.out.printf("Saved! Here is the new child ticket percentage off: ");
        IOManager.printDouble((1 - PriceConfiguration.getInstance().getChildPercentageOff()) * 100,2);
        System.out.printf("%%  " + "(Meaning only need to pay " + PriceConfiguration.getInstance().getChildPercentageOff() * 100 + "%% of the original price)\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetSCTicketPercentageDiscount(){
        System.out.printf("Current Senior Citizen Ticket Percentage Off: ");
        IOManager.printDouble((1 - PriceConfiguration.getInstance().getSeniorCitizenPercentageOff()) * 100,2);
        System.out.printf("%% \n");
        double userInput = IOManager.getUserInputDouble("What is the new senior citizen ticket percentage off that you want to set? (from 0 to 100) example: 20 for 20% discount for senior citizen ticket",0,100);
        BigDecimal bd = new BigDecimal((100 - userInput) / 100).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setSeniorCitizenPercentageOff(roundedInput);
         System.out.printf("Saved! Here is the Senior citizen ticket percentage off: ");
        IOManager.printDouble((1 - PriceConfiguration.getInstance().getSeniorCitizenPercentageOff()) * 100,2);
        System.out.printf("%%  " + "(Meaning only need to pay " + PriceConfiguration.getInstance().getSeniorCitizenPercentageOff() * 100 + "%% of the original price)\n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetGSTPercentageIncrease(){
        System.out.printf("Current GST Percentage: ");
        IOManager.printDouble(PriceConfiguration.getInstance().getGstPercentageIncrease() * 100,2);
        System.out.printf("%%" +  "\n");
        double userInput = IOManager.getUserInputDouble("What is the new gst percentage that you want to set? (from 0 to 100) example: 7 for 7% charge on gst",0,100);
        BigDecimal bd = new BigDecimal(userInput / 100).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        PriceConfiguration.getInstance().setGstPercentageIncrease(roundedInput);
        System.out.printf("Saved! Here is the new gst percentage: ");
        IOManager.printDouble(PriceConfiguration.getInstance().getGstPercentageIncrease() * 100,2);
        System.out.printf("%% \n");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }
}
