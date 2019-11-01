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
		
		super.activate();
		
		int userInput = IOManager.getUserInputInt("\nPlease input your choice",1,options.length);
		processUserInput(userInput);
	}


	@Override
	protected void processUserInput(int input) {
		
		switch (input) {
			case 1:
				ViewNavigator.pushView(new MovieBrowseOptionsView());
				break;
			case 2:
				System.out.println("\nThis view is not built out yet....\n");
				this.activate();
				break;
			case 3:
				ViewNavigator.popView();
			}
	}

}
