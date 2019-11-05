package View;
import java.util.ArrayList;
import java.util.Arrays;

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
	private String viewContent = "Please choose the mode by which you want to search for movies\n";
	
	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		int userInput = IOManager.getUserInputInt("\nPlease input your choice",1,options.size());
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
		movies.add(new Movie("Avatar",Movie.MovieStatus.COMINGSOON));
		movies.add(new Movie("Movie 2",Movie.MovieStatus.ENDED));
		movies.add(new Movie("Movie 3",Movie.MovieStatus.NOWSHOWING));
		ViewNavigator.pushView(new ListMoviesView(movies));
	}
	
	private void handleOptionListMovieOnDate() {
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
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
