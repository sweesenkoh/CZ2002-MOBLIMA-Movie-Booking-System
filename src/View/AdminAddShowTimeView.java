package View;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

public class AdminAddShowTimeView extends View {


    private ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Add Show Time",
            "Back to Previous Page"
    ));

    private String title = "Admin: Add or Remove Show Time for: ";
    private String viewContent = "";
    private Movie selectedMovie;

    private ArrayList<Cineplex> cineplexes;
    private LocalDate chosenDate;
    private Integer chosenCinemaIndex;
    private Integer chosenCineplexIndex;


    public AdminAddShowTimeView(Movie selectedMovie){
        this.selectedMovie = selectedMovie;
        this.title += selectedMovie.getTitle();

        handleGettingInfo();
    }


    @Override
    public void activate() {
        super.setTitle(this.title);
        super.setOptions(this.options);
        super.printViewTitle();
        printingCurrentAvailableShowTime();
        super.printOptions();
        int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
        processUserInput(userInput);
    }


    @Override
    protected void processUserInput(int input) {

        if (input == this.options.size()){
            ViewNavigator.popView();
        }

        else if (this.options.size() == 2){
            this.handleAddShowTime();
        }

        else if (this.options.size() == 3){
            if (input == 1){
                this.handleAddShowTime();
            }else{
                this.handleRemoveShowTime();
            }
        }

    }

    private void handleGettingInfo(){
        cineplexes = DatabaseManager.retrieveAllCineplexes();
        ArrayList<String> cineplexesString = new ArrayList<>();
        for (Cineplex cineplex : cineplexes){
            cineplexesString.add(cineplex.getName());
        }
        IOManager.printMenuOptions(cineplexesString);
        chosenCineplexIndex = IOManager.getUserInputInt("Please choose one of the cineplexes",1,cineplexes.size());
        ArrayList<String> cinemaStrings = new ArrayList<>();
        for (Cinema cinema : cineplexes.get(chosenCineplexIndex - 1).getCinemas()){
            cinemaStrings.add("Cinema Code: " + cinema.getCode() + "  [ " + cinema.getCinemaClass().getClassName() + " ]");
        }
        IOManager.printMenuOptions(cinemaStrings);
        chosenCinemaIndex = IOManager.getUserInputInt("Please choose one of the cinemas",1,cinemaStrings.size());
        chosenDate = IOManager.getUserInputDate("Please input the date that you want to insert the show time to: ");
    }

    private void printingCurrentAvailableShowTime(){
        int count = 1;
        for (Showtime showtime:cineplexes.get(chosenCineplexIndex - 1).getCinemas().get(chosenCinemaIndex - 1).getShowtimes()){
            if (showtime.getShowDatetime().toLocalDate().isEqual(chosenDate)){
                if (count == 1) {
                    System.out.println("Here is the current showtime on this day:\n\n");
                }
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy -- HH:mm");
                String formatDateTime = showtime.getShowDatetime().format(formatter);
                System.out.println("    " + count + ") " + formatDateTime);
                count++;
            }
        }

        if (count == 1){
            System.out.println("There is currently no show time inserted on this day");
            if (this.options.size() == 3){
                this.options.remove(1);
                super.setOptions(this.options);
            }
        } else{
            if (this.options.size() == 2){
                this.options.add(1,"Remove Show Time");
                super.setOptions(this.options);
            }
        }
    }

    private void handleRemoveShowTime(){
        int maxlength = cineplexes.get(chosenCineplexIndex - 1).getCinemas().get(chosenCinemaIndex - 1).getShowtimes().size();
        int removeChoice = IOManager.getUserInputInt("Please input the number of the show time that you want to remove: ",1,maxlength);
        ArrayList<Showtime> showtimes = new ArrayList<>();
        ArrayList<Showtime> otherDateShowTimes = new ArrayList<>();

        for (Showtime showtime:cineplexes.get(chosenCineplexIndex - 1).getCinemas().get(chosenCinemaIndex - 1).getShowtimes()){
            if (showtime.getShowDatetime().toLocalDate().isEqual(chosenDate)){
                showtimes.add(showtime);
            }else{
                otherDateShowTimes.add(showtime);
            }
        }

        showtimes.remove(removeChoice - 1);

        for (Showtime showtime : showtimes){
            otherDateShowTimes.add(showtime);
        }

        cineplexes.get(chosenCineplexIndex - 1).getCinemas().get(chosenCinemaIndex - 1).setShowtimes(otherDateShowTimes);
        DatabaseManager.saveCineplexes(cineplexes);
        System.out.println("Removed!");
        this.activate();

    }

    private void handleAddShowTime(){

        System.out.println("What time do u want to insert it in: ");
        System.out.println("Please input the hour component (24-hour format), range (0-23)");
        int hourComponent = IOManager.getUserInputInt("",0,23);
        System.out.println("Please input the minute component (24-hour format), range (0-59)");
        int minuteComponent = IOManager.getUserInputInt("",0,59);


        System.out.println("What would you like to movie type to be? ");
        ArrayList<MovieType> movieTypeList = new ArrayList<MovieType>(EnumSet.allOf(MovieType.class));
        ArrayList<String> movieTypeListStrings = new ArrayList<String>();
        for (int x = 0 ; x < movieTypeList.size() ; x++) {
            movieTypeListStrings.add(movieTypeList.get(x).typeName());
        }
        IOManager.printMenuOptions(movieTypeListStrings);
        int typeChoice = IOManager.getUserInputInt("Input the choice: ",1,movieTypeListStrings.size());
        MovieType typeChosen = movieTypeList.get(typeChoice - 1);

        LocalDateTime chosenDateTime = chosenDate.atTime(hourComponent,minuteComponent);
        Showtime chosenShowTime = new Showtime(chosenDateTime,this.selectedMovie,cineplexes.get(chosenCineplexIndex - 1).getCinemas().get(chosenCinemaIndex - 1),typeChosen);
        System.out.println(chosenShowTime.toString());
        System.out.println("Here is the show time that you have created, proceed to save?");
        int userSaveChoice = IOManager.getUserInputInt("1 - Proceed to save, 0 - Cancel",0,1);

        if (userSaveChoice == 1){
            cineplexes.get(chosenCineplexIndex - 1).getCinemas().get(chosenCinemaIndex - 1).addShowTime(chosenShowTime);
            DatabaseManager.saveCineplexes(cineplexes);
            System.out.println("Saved!");
        }

        this.activate();

    }
}
