package View;

import Controller.IOManager;
import Controller.ViewNavigator;

public class MovieBrowseOptionsView extends View {
	
	private String[] options = new String[] {
			"Search movie",
			"List movie on a date",
			"List all movies",
			"List past movies",
			"List upcoming and current showing movies",
			"Back to Previous Page"
	};
	
	private String title = "Browse Movie by Options";
	private String viewContent = "Please choose the mode by which you want to search for movies\n";
	
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
			this.handleOptionSearchMovie();
			break;
		case 2:
			this.handleOptionListMovieOnDate();
			break;
		case 3:
			this.handleListAllMoviesOption();
			break;
		case 6:
			ViewNavigator.popView();
		}
	}

	private void handleOptionSearchMovie(){
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}
	
	private void handleOptionListMovieOnDate() {
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}

	private void handleListAllMoviesOption(){
		System.out.println("\nThis view is not built out yet....\n");
		this.activate();
	}



}
