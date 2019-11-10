package View;

import java.util.ArrayList;

import Controller.ViewNavigator;
import Model.Movie;

public class AdminListMoviesView extends ListMoviesView {

	public AdminListMoviesView(ArrayList<Movie> movies) {
		super(movies);
	}

	@Override
	protected void processUserInput(int input) {

		if (input == -1) {
			ViewNavigator.popView();
		}else {
			ViewNavigator.pushView(new AdminChangeMovieInfoView(this.movies.get(input - 1)));
		}
	}

}
