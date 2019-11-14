package View;

import Controller.ViewNavigator;
import Model.Movie;

import java.util.ArrayList;

public class MovieGoerListTop5MoviesView extends BaseListTop5MoviesView {


    public MovieGoerListTop5MoviesView(ArrayList<Movie> movies, Top5MoviesOption listOption) {
        super(movies, listOption);
    }

    /**
     * This method helps to manage execution of code based on the user put choice on the View options.
     * @param input the index of the options
     */
    @Override
    protected void processUserInput(int input) {
        if (input == -1) {
            ViewNavigator.popView();
        }else {
            ViewNavigator.pushView(new MovieViewingView(this.movies.get(input - 1)));
        }
    }
}
