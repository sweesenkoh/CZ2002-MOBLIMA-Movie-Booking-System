package View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;
import Model.MovieStatus;

public class AdminChangeMovieInfoView extends View {
	
	private Movie selectedMovie;
	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"Status",
			"Director",
			"Synopsis",
			"Title",
			"Casts",
			"Go back to admin main menu"
	)); 
	
	
	private String title = "Movie Info Modification: ";
	private String viewContent = "Choose the following options to change the information of the movie";

	
	
	public AdminChangeMovieInfoView(Movie movie) {
		this.selectedMovie = movie;
		this.title += movie.getTitle();
	}
	
	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		
		int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
		processUserInput(userInput);
	}
	//director,synopsis,cast,status,title
	
	
	@Override
	protected void processUserInput(int input) {
		
		if (input == options.size()) {
			ViewNavigator.popViews(3);
		
		}else if (input == 1) {
			System.out.println("Current Status: " + this.selectedMovie.getStatus().displayName());
			System.out.println("What would you like to status to? ");
			ArrayList<MovieStatus> movieStatusList = new ArrayList<MovieStatus>(EnumSet.allOf(MovieStatus.class));
			ArrayList<String> movieStatusListStrings = new ArrayList<String>();
			for (int x = 0 ; x < movieStatusList.size() ; x++) {
				movieStatusListStrings.add(movieStatusList.get(x).displayName());
			}
			IOManager.printMenuOptions(movieStatusListStrings);
			int statusChoice = IOManager.getUserInputInt("Input the choice: ",1,movieStatusListStrings.size());
			MovieStatus statusChosen = movieStatusList.get(statusChoice - 1);
			this.selectedMovie.setStatus(statusChosen);
			DatabaseManager.modifyMovieWithNewValues(selectedMovie);
			System.out.println("Saved");
		
		}else if (input == 2) {
			System.out.println("Current Director: " + this.selectedMovie.getDirector());
			System.out.println("What would you like to change the director to? ");
			String newDirectorName = IOManager.getUserInputString("Input Name: ");
			selectedMovie.setDirector(newDirectorName);
			DatabaseManager.modifyMovieWithNewValues(selectedMovie);
			System.out.println("Saved");
		
		}else if (input == 3) {
			System.out.println("Current Synopsis: " + this.selectedMovie.getSynopsis());
			System.out.println("What would you like to change the synopsis to? ");
			String newSynopsis = IOManager.getUserInputString("Input Synopsis: ");
			selectedMovie.setSynopsis(newSynopsis);
			DatabaseManager.modifyMovieWithNewValues(selectedMovie);
			System.out.println("Saved");
		
		}else if (input == 4) {
			System.out.println("Current Title: " + this.selectedMovie.getTitle());
			System.out.println("What would you like to change the title to? ");
			String newTitle = IOManager.getUserInputString("Input New Title: ");
			selectedMovie.setSynopsis(newTitle);
			DatabaseManager.modifyMovieWithNewValues(selectedMovie);
			System.out.println("Saved");
		}
		
		ArrayList<String> choices = new ArrayList<>();
		choices.add("Continue");
		choices.add("Quit Editing");
		IOManager.printMenuOptions(choices);
		
		int userChoice = IOManager.getUserInputInt("",1,2);
		if (userChoice == 1) {
			this.activate();
		}else {
			ViewNavigator.popViews(3);
		}
		
	}

}
