package View;

import java.util.ArrayList;

import Controller.ViewNavigator;
import Model.Movie;

public class AdminListMoviesView extends BaseListMoviesView {

	public AdminListMoviesView(ArrayList<Movie> movies) {
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
			ViewNavigator.pushView(new AdminChangeMovieInfoView(this.movies.get(input - 1)));
		}

	}

}
