package View;
import java.util.ArrayList;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class ListMoviesView extends View {
	
	
	private ArrayList<String> options = new ArrayList<>();
	private String title = "Movies List";
	private String viewContent = "Here are the list of movies: \n";
	
	private ArrayList<Movie> movies = new ArrayList<>();
	
	
	public ListMoviesView(ArrayList<Movie> movies) {
		for (Movie movie : movies) {
			this.options.add(movie.getTitle());
		}
		this.movies = movies;
		this.options.add("Back to Previous Page");
	}
	
	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		
		int userInput = IOManager.getUserInputInt("\nPlease input a choice",1,options.size());
		processUserInput(userInput);
	}

	@Override
	protected void processUserInput(int input) {
		
		if (input == options.size()) {
			ViewNavigator.popView();
		}else {
			ViewNavigator.pushView(new MovieViewingView(this.movies.get(input - 1)));
		}
	}

}
