package View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class MovieBrowseOptionsView extends View {
	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"Search movie",
			"List movie on a date",
			"List all movies",
			"List past movies",
			"List upcoming and current showing movies",
			"Back to Previous Page"
	)); 
	
	private String title = "Browse Movie by Options";
	private String viewContent = "Please choose the mode by which you want to search for movies";
	
	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		int userInput = IOManager.getUserInputInt("Please input your choice",1,options.size());
		processUserInput(userInput);
	}

	@Override
	protected void processUserInput(int input) {
		switch (input) {
		case 1:
			this.handleOptionSearchMovie();
			break;
		case 2:
			this.handleOptionListMovieOnDate();
			break;
		case 3:
			this.handleListAllMoviesOption();
			break;
		case 4:
			this.handleListPastMoviesOption();
			break;
		case 5:
			this.handleListUpcomingAndCurrentMoviesOption();
			break;
		case 6:
			ViewNavigator.popView();
		}
	}

	private void handleOptionSearchMovie(){
		ArrayList<Movie> movies = new ArrayList<>();
		movies = DatabaseManager.retrieveAllMovies();
		String userInput = IOManager.getUserInputString("Please write the name of the movie: ");
		
		ArrayList<Movie> filteredMovieList= (ArrayList<Movie>) movies.stream().filter(movie -> movie.getTitle().matches("(?i).*" + userInput + ".*")).collect(Collectors.toList());
		ViewNavigator.pushView(new ListMoviesView(filteredMovieList));
	}
	
	private void handleOptionListMovieOnDate() {
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
		ViewNavigator.pushView(new ListMoviesView(movies));
	}

	private void handleListAllMoviesOption(){
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}
	
	private void handleListPastMoviesOption() {
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}
	
	private void handleListUpcomingAndCurrentMoviesOption() {
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}



}
