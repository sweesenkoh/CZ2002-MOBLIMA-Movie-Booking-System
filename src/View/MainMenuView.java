package View;
import Controller.IOManager;
import Controller.ViewNavigator;

public class MainMenuView extends View {

	
	private String[] options = new String[] {
			"Admin","Movie-Goer"
	};
	private String title = "Moblima Movie Booking System";
	private String viewContent = "Welcome To Moblima Movie Booking System! Are you a staff or a movie-goer?\n";
	
	
	@Override
	public void activate() {
		
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		
		int userInput = IOManager.getUserInputInt("\nPlease input a choice",1,options.length);
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
