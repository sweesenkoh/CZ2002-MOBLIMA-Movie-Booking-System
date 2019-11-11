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

        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current Base Price: " + priceConfiguration.getBasePrice());
        double userInput = IOManager.getUserInputDouble("What is the new base price that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setBasePrice(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new base price: " + priceConfiguration.getBasePrice());
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();

    }

    private void handleSetBasePlatinumTicketPrice(){

        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current Base Platinum Price: " + priceConfiguration.getPlatinumBasePrice());
        double userInput = IOManager.getUserInputDouble("What is the new base platinum price that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setPlatinumBasePrice(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new base platinum price: " + priceConfiguration.getPlatinumBasePrice());
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetBaseGoldTicketPrice(){

        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current Gold Platinum Price: " + priceConfiguration.getGoldBasePrice());
        double userInput = IOManager.getUserInputDouble("What is the new base gold class price that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setGoldBasePrice(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new base gold price: " + priceConfiguration.getGoldBasePrice());
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetWeekendPriceIncrement(){
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current Weekend Price Increment: " + priceConfiguration.getWeekendIncrement());
        double userInput = IOManager.getUserInputDouble("What is the new weekend price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setWeekendIncrement(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new weekend price increment: " + priceConfiguration.getWeekendIncrement());
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetPHPriceIncrement(){
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current Public Holiday Price Increment: " + priceConfiguration.getPublicHolidayIncrement());
        double userInput = IOManager.getUserInputDouble("What is the new public holiday price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setPublicHolidayIncrement(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new public holiday price increment: " + priceConfiguration.getPublicHolidayIncrement());
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSet3DPriceIncrement(){
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current 3D Price Increment: " + priceConfiguration.getThreeDMovieIncrement());
        double userInput = IOManager.getUserInputDouble("What is the new 3D price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setThreeDMovieIncrement(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new 3D price increment: " + priceConfiguration.getThreeDMovieIncrement());
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();

    }

    private void handleSetBlockbusterPriceIncrement(){
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current 3D Price Increment: " + priceConfiguration.getBlockbusterMovieIncrement());
        double userInput = IOManager.getUserInputDouble("What is the new 3D price increment that you want to set? (We will round up to 2dp)",0,Double.POSITIVE_INFINITY);
        BigDecimal bd = new BigDecimal(userInput).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setBlockbusterMovieIncrement(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new blockbuster movie price increment: " + priceConfiguration.getBlockbusterMovieIncrement());
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetChildTicketPercentageDiscount(){
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current Child Ticket Percentage Off: " + priceConfiguration.getChildPercentageOff() * 100 + "%");
        double userInput = IOManager.getUserInputDouble("What is the new child ticket percentage off that you want to set? (from 0 to 100) example: 20 for 20%",0,100);
        BigDecimal bd = new BigDecimal(userInput / 100).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setChildPercentageOff(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the Child ticket percentage off: " + priceConfiguration.getChildPercentageOff() * 100 + "%");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetSCTicketPercentageDiscount(){
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current Senior Citizen Ticket Percentage Off: " + priceConfiguration.getSeniorCitizenPercentageOff()*100 + "%");
        double userInput = IOManager.getUserInputDouble("What is the new senior citizen ticket percentage off that you want to set? (from 0 to 100) example: 20 for 20%",0,100);
        BigDecimal bd = new BigDecimal(userInput / 100).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setSeniorCitizenPercentageOff(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the Senior citizen ticket percentage off: " + priceConfiguration.getSeniorCitizenPercentageOff() * 100 + "%");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }

    private void handleSetGSTPercentageIncrease(){
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        System.out.println("Current GST Percentage: " + priceConfiguration.getGstPercentageIncrease() * 100 + "%");
        double userInput = IOManager.getUserInputDouble("What is the new gst percentage that you want to set? (from 0 to 100) example: 20 for 20%",0,100);
        BigDecimal bd = new BigDecimal(userInput / 100).setScale(2, RoundingMode.HALF_UP);
        double roundedInput = bd.doubleValue();
        priceConfiguration.setGstPercentageIncrease(roundedInput);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        System.out.println("Saved! Here is the new gst percentage: " + priceConfiguration.getChildPercentageOff() * 100 + "%");
        IOManager.getUserInputString("Press any key to continue: ");
        this.activate();
    }
}
