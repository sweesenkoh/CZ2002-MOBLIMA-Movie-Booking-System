package View;


import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class MovieGoerListReviewsView extends View {

	private String title = "Reviews for: ";
	private String viewContent = " ";
	private Movie selectedMovie;
	
	public MovieGoerListReviewsView(Movie movie) {
		this.selectedMovie = movie;
		this.title += movie.getTitle();
	}
	
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
