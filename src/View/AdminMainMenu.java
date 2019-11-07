package View;

import java.util.ArrayList;
import java.util.Arrays;

import Controller.IOManager;
import Controller.ViewNavigator;

public class AdminMainMenu extends View {
	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"Create New Movie",
			"Update Movie Information",
			"Configure System Settings",
			"List Current Top 5 Movies",
			"Back to Previous Page"
	)); 
	
	private String title = "Admin Main Menu";
	private String viewContent = "Welcome! Please select one of the options below: ";

	@Override
	public void activate() {
		
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		
		int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
		processUserInput(userInput);
	}
	
	@Override
	protected void processUserInput(int input) {
		if (input == options.size()) {
			ViewNavigator.popView();
		}else if (input == 1) {
			ViewNavigator.pushView(new CreateNewMovieView());
		}else if (input == 2) {
			ViewNavigator.pushView(new AdminMovieBrowseOptions());
		}
	}

}
