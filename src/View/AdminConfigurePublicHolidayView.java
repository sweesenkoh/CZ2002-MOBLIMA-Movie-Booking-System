package View;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.PriceConfiguration;
import Model.PublicHoliday;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class AdminConfigurePublicHolidayView extends View {

    private ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Add New Public Holiday",
            "Delete Existing Public Holiday",
            "Go back to previous menu"
    ));

    private String title = "Configure Public Holiday";
    private String viewContent = "";
    private ArrayList<PublicHoliday> publicHolidays = DatabaseManager.loadPriceConfiguration().getPublicHolidays();

    public AdminConfigurePublicHolidayView(){
    }


    @Override
    public void activate() {
        viewContent = " ";
        int count = 1;
        for (PublicHoliday publicHoliday : publicHolidays){
            viewContent += "     " + count + ". " + publicHoliday.getName() + "  (" + publicHoliday.getDate().format(DateTimeFormatter.ofPattern("d/M/yyyy")) + ") \n";
            count++;
        }

        if (this.publicHolidays.size() == 0){
            viewContent += "There is currently no public holiday set in the system";
        }

        viewContent += "\n";

        super.setOptions(options);
        super.setTitle(this.title);
        super.setViewContent(this.viewContent);
        super.activate();

        int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
        processUserInput(userInput);
    }



    @Override
    protected void processUserInput(int input) {
        if (input == options.size()){
            ViewNavigator.popView();
        }

        else if (input == 1){
            this.handleAddNewPublicHoliday();
        }

        else if (input == 2){
            this.handleDeletePublicHoliday();
        }
    }

    private void handleAddNewPublicHoliday(){
        String name = IOManager.getUserInputString("Please input the name of the public holiday");
        LocalDate date = IOManager.getUserInputDate("Please input the date of the public holiday");
        PublicHoliday publicHoliday = new PublicHoliday(name,date);
        this.publicHolidays.add(publicHoliday);
        PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
        priceConfiguration.setPublicHolidays(this.publicHolidays);
        DatabaseManager.savePriceConfiguration(priceConfiguration);
        IOManager.getUserInputString("Successful! Please input any key to continue");
        this.activate();
    }

    private void handleDeletePublicHoliday(){
        if (this.publicHolidays.size() == 0){
            System.out.println("There is currently no items available for deletion");
            IOManager.getUserInputString("Press any key to continue");
            this.activate();
        }else{
            int count = 1;
            for (PublicHoliday publicHoliday : publicHolidays){
                if (count == 1){
                    System.out.printf(" ");
                }
                String string = "     " + count + ". " + publicHoliday.getName() + "  (" + publicHoliday.getDate().format(DateTimeFormatter.ofPattern("d/M/yyyy")) + ") ";
                System.out.println(string);
                count++;
            }
            System.out.println("\n\n");
            int userChoice = IOManager.getUserInputInt("Please select the public holiday that you wish to delete: ",1,this.publicHolidays.size());
            this.publicHolidays.remove(userChoice - 1);
            PriceConfiguration priceConfiguration = DatabaseManager.loadPriceConfiguration();
            priceConfiguration.setPublicHolidays(this.publicHolidays);
            DatabaseManager.savePriceConfiguration(priceConfiguration);
            IOManager.getUserInputString("Successful! Please input any key to continue");
            this.activate();
        }
    }
}
