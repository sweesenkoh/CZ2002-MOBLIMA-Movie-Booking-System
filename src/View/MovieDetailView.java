package View;

import java.util.ArrayList;
import java.util.Arrays;

import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;

public class MovieDetailView extends View {
	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"Back to Previous Page"
	)); 
	
	private String title;
	private String viewContent;

	public MovieDetailView(Movie movie) {
		this.title = movie.getTitle();
		this.viewContent = movie.toString();
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
		}
	}

}
