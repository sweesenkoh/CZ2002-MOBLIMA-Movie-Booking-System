package View;

import java.util.ArrayList;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;
import Model.MovieStatus;

public class MovieViewingView extends View {
	
	private ArrayList<String> options = new ArrayList<>();
	private String title;
	private String viewContent = "You have chosen this movie, please choose one of the following options: ";
	private Movie movie;
	
	public MovieViewingView(Movie movie) {
		this.movie = movie;
		options.add("View Movie Detail");
		if (movie.getStatus() == MovieStatus.COMINGSOON){
			options.add("Book");
		}else if (movie.getStatus() == MovieStatus.ENDED){
			options.add("Leave Review");
			options.add("Read Reviews");
		}else {
			options.add("Book Ticket");
			options.add("Leave Review");
			options.add("Read Reviews");
		}
		options.add("Back to Previous Page");
		this.title = "Movie: " + movie.getTitle() + " [ " + movie.getStatus().displayName() + " ] ";
	}
	
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
		
		if (input == options.size()) {
			ViewNavigator.popView();
		}else if (input == 1) {
			ViewNavigator.pushView(new MovieDetailView(this.movie));
		}else if (movie.getStatus() == MovieStatus.COMINGSOON) {
			//input 2 is book ticket
		}else if (movie.getStatus() == MovieStatus.ENDED) {
			if (input == 2) {
				ViewNavigator.pushView(new LeaveReviewsView(this.movie));
			}else if (input == 3) {
				ViewNavigator.pushView(new ListReviewsView(this.movie));
			}
		}else {
			//input 2 is boook
			//input 4 read reviews
			//input 3 is leave review
		}

	}

}
