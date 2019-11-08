package View;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Cinema;
import Model.Cineplex;
import Model.Movie;
import Model.Showtime;

import java.util.ArrayList;
import java.util.Arrays;

public class BookingBrowseOptionsView extends View {

    private ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Choose Cineplex",
            "Choose Date",
            "By Both Options"
    ));


    private String title = "Booking Options";
    private String viewContent = "Do you want to list available movies in a particular cineplex, or list available movies in all cineplexes, or by both?";
    private Movie selectedMovie;

    public BookingBrowseOptionsView(Movie movie){
        this.selectedMovie = movie;
    }

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
                this.handleChooseCineplex();
                break;
            case 2:
                this.handleChooseByDate();
                break;
            case 3:
                this.handleChooseByBoth();
            default:
                break;
        }
    }

    private void handleChooseCineplex(){

        ArrayList<Cineplex> cineplexes = DatabaseManager.retrieveAllCineplexes();
        ArrayList<String> cineplexStrings = new ArrayList<>();
        for (Cineplex cineplex : cineplexes) { cineplexStrings.add(cineplex.getName());}
        IOManager.printMenuOptions(cineplexStrings);
        int userCineplexChoice = IOManager.getUserInputInt("Please choose one of the cineplex",1,cineplexes.size());
        Cineplex chosenCineplex = cineplexes.get(userCineplexChoice - 1);

        ArrayList<Showtime> showtimes = new ArrayList<>();
        for (Cinema cinema : chosenCineplex.getCinemas()){
            for (Showtime showtime : cinema.getShowtimes()){
                showtimes.add(showtime);
            }
        }

        //have to think of some way of sorting the showtimes
        //this is sort by date

        ViewNavigator.pushView(new BookingListShowTimesView(showtimes));

    }

    private void handleChooseByDate(){

    }

    private void handleChooseByBoth(){

    }
}
