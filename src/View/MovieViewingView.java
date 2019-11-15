package View;

import java.util.ArrayList;
import Controller.IOManager;
import Controller.ViewsManager;
import Model.Movie;
import Model.MovieStatus;


/**
 * This BaseView class presents the various options for users for a given selected movies, such as booking of tickets or leaving reviews.
 */

public class MovieViewingView extends BaseView {

	/**
	 * This is the BaseView options
	 */
	private ArrayList<String> options = new ArrayList<>();

	/**
	 * This is the BaseView title
	 */
	private String title;

	/**
	 * This is BaseView content
	 */
	private String viewContent = "You have chosen this movie, please choose one of the following options: ";

	/**
	 * This is the selected movie
	 */
	private Movie movie;

	/**
	 * This creates a new MovieViewingView with a given Movie object
	 * @param movie The selected movie for viewing the options available
	 */
	public MovieViewingView(Movie movie) {
		this.movie = movie;
		options.add("BaseView Movie Detail");
		if (movie.getStatus() == MovieStatus.COMINGSOON){
//			options.add("Book");  //logically coming soon movies should not be able to be booked
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

	/**
	 * This method helps to transform this BaseView into active state
	 */
	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();

		int userInput = IOManager.getUserInputInt("Please input your choice",1,options.size());
		processUserInput(userInput);
	}

	/**
	 * This method helps to manage execution of code based on the user put choice on the BaseView options.
	 * @param input the index of the options
	 */
	@Override
	protected void processUserInput(int input) {
		
		if (input == options.size()) {
			ViewsManager.popView();
		}else if (input == 1) {
			ViewsManager.pushView(new MovieDetailView(this.movie));
		}else if (movie.getStatus() == MovieStatus.COMINGSOON) {
//			if (input == 2){
//				ViewsManager.pushView(new BookingBrowseOptionsView(this.movie));
//			}
		}else if (movie.getStatus() == MovieStatus.ENDED) {
			if (input == 2) {
				ViewsManager.pushView(new MovieGoerLeaveReviewView(this.movie));
			}else if (input == 3) {
				ViewsManager.pushView(new MovieGoerListReviewsView(this.movie));
			}
		}else {
			if (input == 2){
				ViewsManager.pushView(new MovieGoerBookingFilterShowtimesView(this.movie));
			}
			else if (input == 3) {
				ViewsManager.pushView(new MovieGoerLeaveReviewView(this.movie));
			}else if (input == 4) {
				ViewsManager.pushView(new MovieGoerListReviewsView(this.movie));
			}
		}

	}

}
