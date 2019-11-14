package View;


import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;


/**
 * This View class helps to list reviews for a particular movie
 */
public class MovieGoerListReviewsView extends View {

	/**
	 * This is the View title
	 */
	private String title = "Reviews for: ";

	/**
	 * This is the View content
	 */
	private String viewContent = " ";

	/**
	 * This is the selected movie
	 */
	private Movie selectedMovie;

	/**
	 * This is the constructor, which takes a Movie object as an argument
	 * @param movie The selected Movie object
	 */
	public MovieGoerListReviewsView(Movie movie) {
		this.selectedMovie = movie;
		this.title += movie.getTitle();
	}

	/**
	 * This transforms the View state to be in active state
	 */
	public void activate() {
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		
		IOManager.printMultipageOptions(this.selectedMovie.getReviews(),3,"Close this Page");
		ViewNavigator.popView();
	
	}

	/**
	 * This method helps to manage execution of code based on the user put choice on the View options.
	 * @param input the index of the options
	 */
	@Override
	protected void processUserInput(int input) {

	}


}
