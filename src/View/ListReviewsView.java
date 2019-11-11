package View;


import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class ListReviewsView extends View {

	private String title = "Reviews for: ";
	private String viewContent = " ";
	private Movie selectedMovie;
	
	public ListReviewsView(Movie movie) {
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

	@Override
	protected void processUserInput(int input) {
		// TODO Auto-generated method stub

	}

}
