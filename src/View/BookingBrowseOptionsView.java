package View;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Cinema;
import Model.Cineplex;
import Model.Movie;
import Model.Showtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;

public class BookingBrowseOptionsView extends View {

    private ArrayList<String> options = new ArrayList<>(Arrays.asList(
            "Filter by Cineplex",
            "Filter by Date",
//            "Filter by Both Options",
            "Do not filter",
            "Back to Previous Page"
    ));


    private String title = "Booking Options: ";
    private String viewContent = "How do you want to filter the showtime results?";
    private Movie selectedMovie;

    public BookingBrowseOptionsView(Movie movie){
        this.selectedMovie = movie;
        this.title += this.selectedMovie.getTitle();
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
//            case 3:
//                this.handleChooseByBoth();
            case 3:
                this.handleDoNotFilter();
            default:
                ViewNavigator.popView();
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
                if (showtime.getMovie().getTitle().equals(selectedMovie.getTitle())){
                    if (showtime.getShowDatetime().isAfter(LocalDateTime.now())){
                        showtimes.add(showtime); //do not show any past showtime
                    }
                }
            }
        }

        //have to think of some way of sorting the showtimes
        //this is sort by date
        Collections.sort(showtimes, Comparator.comparing(Showtime::getShowDatetime));
        ViewNavigator.pushView(new BookingListShowTimesView(showtimes));
    }

    private void handleChooseByDate(){

        ArrayList<Cineplex> cineplexes = DatabaseManager.retrieveAllCineplexes();

        LocalDate chosenDate = IOManager.getUserInputDate("Input the date: ");
        ArrayList<Showtime> showtimes = new ArrayList<>();
        for (Cineplex cineplex : cineplexes){
            for (Cinema cinema : cineplex.getCinemas()){
                for (Showtime showtime : cinema.getShowtimes()){
                    if (showtime.getMovie().getTitle().equals(selectedMovie.getTitle())){
                        if (showtime.getShowDatetime().toLocalDate().isEqual(chosenDate)){
                            showtimes.add(showtime);
                        }
                    }
                }
            }
        }
        Collections.sort(showtimes, Comparator.comparing(Showtime::getShowDatetime));
        ViewNavigator.pushView(new BookingListShowTimesView(showtimes));

    }

//    private void handleChooseByBoth(){
//
//    }

    private void handleDoNotFilter(){
        ArrayList<Cineplex> cineplexes = DatabaseManager.retrieveAllCineplexes();
        ArrayList<Showtime> showtimes = new ArrayList<>();
        for (Cineplex cineplex : cineplexes){
            for (Cinema cinema : cineplex.getCinemas()){
                for (Showtime showtime : cinema.getShowtimes()){
                    if (showtime.getMovie().getTitle().equals(selectedMovie.getTitle())){
                        showtimes.add(showtime);
                    }
                }
            }
        }
        Collections.sort(showtimes, Comparator.comparing(Showtime::getShowDatetime));
        ViewNavigator.pushView(new BookingListShowTimesView(showtimes));
    }


}
