import java.util.ArrayList;
import Model.MovieStatus;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;
import Model.MovieStatus;
import View.MainMenuView;

public class Moblima {

	public static void main(String[] args) {
		
//		DatabaseManager.overwriteMoviesDatabaseWithMovies(new ArrayList<Movie>());
//	DatabaseManager.saveMovieToDataBase(new Movie("AvatarEnded11",MovieStatus.ENDED));
//		DatabaseManager.saveMovieToDataBase(new Movie("AvatarEnded12",MovieStatus.ENDED));
//		DatabaseManager.saveMovieToDataBase(new Movie("AvatarEnded13",MovieStatus.ENDED));
		ViewNavigator.pushView(new MainMenuView());

	}

}
