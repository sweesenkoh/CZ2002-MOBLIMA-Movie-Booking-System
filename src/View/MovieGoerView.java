package View;
import Controller.IOManager;
import Controller.ViewNavigator;

public class MovieGoerView extends View {
	
	private String[] options = new String[] {
			"Watch Movie",
			"Check Booking History",
			"Back to Previous Page"
	};
	
	private String title = "Movie-Goer Menu";
	private String viewContent = "What yould you like to do?\n";

	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.printViewTitle();
		super.printViewContent();
		super.printOptions();
		
		int userInput = IOManager.getUserInputInt("Please input your choice",1,options.length);
		processUserInput(userInput);
	}


	@Override
	public void processUserInput(int input) {
		
		switch (input) {
			case 1:
				ViewNavigator.pushView(new MovieGoerView());
				break;
			case 3:
				ViewNavigator.popView();
			}
	}

}
