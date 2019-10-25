

public class MovieGoerView extends View {


	protected void activate() {
		printViewContent();
		printOptions();
		
		int userInput = IOManager.getUserInputInt("Please input your choice",1,3);
		processUserInput(userInput);
	}

	@Override
	protected void printOptions() {
		String[] options = new String[] {
				"Watch Movie",
				"Check Booking History",
				"Back to Previous Page"
		};
		IOManager.printMenuOptions(options);
	}

	@Override
	protected void processUserInput(int input) {
		
		switch (input) {
			case 1:
				ViewNavigator.pushView(new MovieGoerView());
				break;
			case 3:
				ViewNavigator.popView();
			}
	}

	@Override
	protected void printViewContent() {
		System.out.println("Welcome to Moblima! Are you the admin or the user?");
	}
	

}
