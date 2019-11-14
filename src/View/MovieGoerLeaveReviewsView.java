package View;

import java.util.ArrayList;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;
import Model.Review;

public class MovieGoerLeaveReviewsView extends View {
	
	
	private ArrayList<String> options = new ArrayList<>();
	private String title = "Leave Review";
	private String viewContent = " ";
	private Movie selectedMovie;
	
	public MovieGoerLeaveReviewsView(Movie movie) {
		this.selectedMovie = movie;
	}
	

	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		
		boolean looping = true;
		
		while (looping) {
			String username = IOManager.getUserInputString("Please input your name: ");
			double userInputRating = IOManager.getUserInputDouble("Please input a your rating (1-5): ",1.0,5.0);
			String reviewContent = IOManager.getUserInputString("Please input your review: ");
			
			Review newReview = new Review(username,userInputRating,reviewContent);
			System.out.println("\n\n   " + newReview.toString());
			
			ArrayList<String> userOptions = new ArrayList<>();
			userOptions.add("Reenter the values");
			userOptions.add("Save and Submit");
			userOptions.add("Go back to previous page without saving");
			IOManager.printMenuOptions(userOptions);
			int userOptionChoice = IOManager.getUserInputInt("Here is your review, choose the following option: ",1,userOptions.size());
			
			if (userOptionChoice == 2) {
				selectedMovie.addReview(newReview);
				DatabaseManager.modifyMovieWithNewValues(selectedMovie);
				break;
			}else if (userOptionChoice == 3) {
				break;
			}
			
		}
		
		ViewNavigator.popView();
		
		
	}

	/**
	 * This method helps to manage execution of code based on the user put choice on the View options.
	 * @param input the index of the options
	 */
	@Override
	protected void processUserInput(int input) {
		// TODO Auto-generated method stub

	}

}
