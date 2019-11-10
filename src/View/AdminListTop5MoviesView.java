package View;

import Controller.DatabaseManager;
import Controller.ViewNavigator;
import Model.Movie;
import Model.Order;
import Model.Ticket;

import java.util.ArrayList;
import java.util.Collections;

public class AdminListTop5MoviesView extends AdminListMoviesView {

    public enum Top5MoviesOption{
        TICKETSALES,RATINGS
    }

    private Top5MoviesOption listOption;

    public AdminListTop5MoviesView(ArrayList<Movie> movies,Top5MoviesOption listOption) {
        super(movies);
        this.listOption = listOption;
    }

    @Override
    protected ArrayList<String> convertMoviesObjectToOptionStrings(ArrayList<Movie> movies){
        ArrayList<String> movieStrings = new ArrayList<>();

        if (this.listOption == Top5MoviesOption.TICKETSALES){

            ArrayList<Order> orders = DatabaseManager.retrieveAllOrders();
            ArrayList<Integer> resultSales = new ArrayList<>();

            for (Movie movie: movies){
                int sales = 0;
                for (Order order: orders){
                    for (Ticket ticket:order.getTickets()){
                        if (ticket.getShowtime().getMovie().getTitle().equals(movie.getTitle())){
                            sales += 1;
                        }
                    }
                }
                resultSales.add(sales);
            }
            int i = 0;
            for (Movie movie : movies) {
                movieStrings.add(movie.getTitle() + "\n       Ticket Sales: " + resultSales.get(i) + "\n");
                i++;
            }
            return movieStrings;

        }

        else if (this.listOption == Top5MoviesOption.RATINGS){
            for (Movie movie : movies) {
                movieStrings.add(movie.getTitle() + "\n       Overall Rating: " + movie.getRatingString() + "\n");
            }
            return movieStrings;
        }

        else{
            return movieStrings;
        }
    }

}

