package View;
import java.util.ArrayList;
import java.util.Arrays;

import Controller.IOManager;
import Controller.ViewNavigator;

public class MainMenuView extends View {

	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"Admin",
			"Movie-Goer"
	)); 
	
	
	private String title = "Moblima Movie Booking System";
	private String viewContent = "Welcome To Moblima Movie Booking System! Are you a staff or a movie-goer?";
	
	
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
		switch (input) {
		case 1:
			System.out.println("going to admin view...");
			break;
		case 2:
			ViewNavigator.pushView(new MovieGoerView());
		}

	}




}
