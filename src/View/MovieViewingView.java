package View;

import java.util.ArrayList;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class MovieViewingView extends View {
	
	private ArrayList<String> options = new ArrayList<>();
	private String title;
	private String viewContent = "You have chosen this movie, please choose one of the following options: \n";
	private Movie movie;
	
	public MovieViewingView(Movie movie) {
		this.movie = movie;
		options.add("View Movie Detail");
		if (movie.getStatus() == Movie.MovieStatus.COMINGSOON){
			options.add("Book");
		}else if (movie.getStatus() == Movie.MovieStatus.ENDED){
			options.add("Leave Review");
		}else {
			options.add("Book Ticket");
			options.add("Leave Review");
		}
		options.add("Back to Previous Page");
		this.title = "Movie: " + movie.getTitle();
	}
	
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
		
		if (input == options.size()) {
			ViewNavigator.popView();
		}else if (input == 1) {
			ViewNavigator.pushView(new MovieDetailView(this.movie));
		}

	}

}
