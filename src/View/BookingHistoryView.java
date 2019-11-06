package View;

import java.util.ArrayList;

import Controller.IOManager;
import Controller.ViewNavigator;

public class BookingHistoryView extends View {
	
	private ArrayList<String> options = new ArrayList<>();
	private String title = "Booking History";
	private String viewContent = "Here is the list of your past bookings:";
	private String username;
	
	public BookingHistoryView(String username) {
		this.username = username;
		
		//insert the history into the options
		this.options.add("Back to Previous Page");
	}
	
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
		}

	}

}
