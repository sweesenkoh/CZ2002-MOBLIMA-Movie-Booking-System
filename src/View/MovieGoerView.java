package View;
import java.util.ArrayList;
import java.util.Arrays;

import Controller.IOManager;
import Controller.ViewNavigator;

public class MovieGoerView extends View {
	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"List Movie",
			"Check Booking History",
			"Back to Previous Page"
	)); 
	
	private String title = "Movie-Goer Menu";
	private String viewContent = "What yould you like to do?";

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
		
		switch (input) {
			case 1:
				ViewNavigator.pushView(new MovieBrowseOptionsView());
				break;
			case 2:
				String username = IOManager.getUserInputString("Please input your username: ");
				ViewNavigator.pushView(new BookingHistoryView(username));
				break;
			case 3:
				ViewNavigator.popView();
			}
	}

}
