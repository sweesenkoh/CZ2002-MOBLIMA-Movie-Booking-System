package View;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.stream.Collectors;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class AdminMovieBrowseOptions extends MovieBrowseOptionsView {
	
	@Override
	protected void handleBackToPreviousView(){
		ViewNavigator.popView();
	}
	
	@Override
	protected void handleOptionSearchMovie(){
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		String userInput = IOManager.getUserInputString("Please write the name of the movie: ");
		
		ArrayList<Movie> filteredMovieList= (ArrayList<Movie>) movies.stream().filter(movie -> movie.getTitle().matches("(?i).*" + userInput + ".*")).collect(Collectors.toList());
		ViewNavigator.pushView(new AdminListMoviesView(filteredMovieList));
	}
	
	@Override
	protected void handleOptionListMovieOnDate() {
		Calendar calendar = Calendar.getInstance();
		String dayOfWeek = new SimpleDateFormat("EE").format(calendar.getTime());
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
		System.out.println("Today's Date: " + timeStamp + " " + dayOfWeek);
		System.out.println(" ");
		Calendar userInputDate = IOManager.getUserInputDate("Please input the date that you want to watch the movie at: \nFormat : dd/MM/yyyy");
		
		//filter the movies by this date
		//then append the movies into this array 
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		ViewNavigator.pushView(new AdminListMoviesView(movies));
	}

	@Override
	protected void handleListAllMoviesOption(){
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		ViewNavigator.pushView(new AdminListMoviesView(movies));
	}
	
	@Override
	protected void handleListPastMoviesOption() {
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}
	
	@Override
	protected void handleListUpcomingAndCurrentMoviesOption() {
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}


}
