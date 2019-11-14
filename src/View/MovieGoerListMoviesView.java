package View;
import java.util.ArrayList;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class MovieGoerListMoviesView extends BaseListMoviesView {

	public MovieGoerListMoviesView(ArrayList<Movie> movies) {
		super(movies);
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
