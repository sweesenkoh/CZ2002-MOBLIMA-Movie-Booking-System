
public class MainMenuView extends View {

	@Override
	protected void activate() {
		printViewContent();
		printOptions();
		
		int userInput = IOManager.getUserInputInt("Please input a choice",1,2);
		processUserInput(userInput);
	}

	@Override
	protected void printOptions() {
		
		String[] options = new String[] {
				"Admin","Movie-Goer"
		};
		IOManager.printMenuOptions(options);
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

	@Override
	protected void printViewContent() {
	
		System.out.println("_____________\n   MainMenuView   \n_____________");

	}

}
