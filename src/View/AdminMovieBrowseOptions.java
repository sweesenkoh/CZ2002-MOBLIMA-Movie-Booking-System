package View;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;
import Model.MovieStatus;

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
//
//	@Override
//	protected void handleOptionListMovieOnDate() {
//		Calendar calendar = Calendar.getInstance();
//		String dayOfWeek = new SimpleDateFormat("EE").format(calendar.getTime());
//		String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
//		System.out.println("Today's Date: " + timeStamp + " " + dayOfWeek);
//		System.out.println(" ");
//		LocalDate userInputDate = IOManager.getUserInputDate("Please input the date that you want to watch the movie at:");
//
//		//filter the movies by this date
//		//then append the movies into this array
//		ArrayList<Movie> movies = new ArrayList<>();
//		movies = DatabaseManager.retrieveAllMovies();
//		ViewNavigator.pushView(new AdminListMoviesView(movies));
//	}

	@Override
	protected void handleListPreviewMovies(){
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		ArrayList<Movie> filteredMovieList= (ArrayList<Movie>) movies.stream().filter(movie -> movie.getStatus().equals(MovieStatus.PREVIEW)).collect(Collectors.toList());
		ViewNavigator.pushView(new AdminListMoviesView(filteredMovieList));
	}
	@Override
	protected void handleListAllMoviesOption(){
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		ViewNavigator.pushView(new AdminListMoviesView(movies));
	}
	
	@Override
	protected void handleListPastMoviesOption() {
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		ArrayList<Movie> filteredMovieList= (ArrayList<Movie>) movies.stream().filter(movie -> movie.getStatus().equals(MovieStatus.ENDED)).collect(Collectors.toList());
		ViewNavigator.pushView(new AdminListMoviesView(filteredMovieList));
	}
	
	@Override
	protected void handleListUpcomingMoviesOption() {
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		ArrayList<Movie> filteredMovieList= (ArrayList<Movie>) movies.stream().filter(movie -> movie.getStatus().equals(MovieStatus.COMINGSOON)).collect(Collectors.toList());
		ViewNavigator.pushView(new AdminListMoviesView(filteredMovieList));
	}

	@Override
	protected void handleListCurrentShowingMovies() {
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		ArrayList<Movie> filteredMovieList= (ArrayList<Movie>) movies.stream().filter(movie -> movie.getStatus().equals(MovieStatus.NOWSHOWING)).collect(Collectors.toList());
		ViewNavigator.pushView(new AdminListMoviesView(filteredMovieList));
	}
}
