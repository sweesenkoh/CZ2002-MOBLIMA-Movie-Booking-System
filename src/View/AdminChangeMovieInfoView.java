package View;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.*;

import javax.xml.crypto.Data;

public class AdminChangeMovieInfoView extends View {
	
	private Movie selectedMovie;
	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"Status",
			"Director",
			"Synopsis",
			"Title",
			"Casts",
			"Censorship Rating",
			"Add Show Time for this movie",
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
//			ViewNavigator.popViews(3);
			ViewNavigator.popTillView(new AdminMainMenu());
		
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
			DatabaseManager.deleteMovieByName(selectedMovie.getTitle());
			selectedMovie.setTitle(newTitle);
			DatabaseManager.saveMovieToDataBase(selectedMovie);
			System.out.println("Saved");
		}else if (input == 5) {
			this.handleChangeCastInformation();
		}else if (input == 6){
			System.out.println("Current Rating: " + this.selectedMovie.getMovieCensorshipRating().displayName());
			System.out.println("What would you like to rating to? ");
			ArrayList<MovieCensorshipRating> movieCensorshipList = new ArrayList<MovieCensorshipRating>(EnumSet.allOf(MovieCensorshipRating.class));
			ArrayList<String> movieCensorshipListStrings = new ArrayList<String>();
			for (int x = 0 ; x < movieCensorshipList.size() ; x++) {
				movieCensorshipListStrings.add(movieCensorshipList.get(x).displayName());
			}
			IOManager.printMenuOptions(movieCensorshipListStrings);
			int censorChoice = IOManager.getUserInputInt("Input the choice: ",1,movieCensorshipListStrings.size());
			MovieCensorshipRating censorChosen = movieCensorshipList.get(censorChoice - 1);
			this.selectedMovie.setMovieCensorshipRating(censorChosen);
			DatabaseManager.modifyMovieWithNewValues(selectedMovie);
			System.out.println("Saved");
		}

		else if (input == 7){
			this.handleAddShowTime();
		}
		
		ArrayList<String> choices = new ArrayList<>();
		choices.add("Continue Editing other information");
		choices.add("Quit Editing");
		IOManager.printMenuOptions(choices);
		
		int userChoice = IOManager.getUserInputInt("",1,2);
		if (userChoice == 1) {
			this.activate();
		}else {
			ViewNavigator.popViews(3);
		}
		
	}


	private void handleChangeCastInformation(){

		while (true) {
			System.out.println("\nHere is the current list of the casts: \n");
			for (String cast : this.selectedMovie.getCasts()) {
				System.out.println("   " + cast);
			}
			ArrayList<String> choices = new ArrayList<>();
			choices.add("Add Cast");
			choices.add("Delete Cast");
			choices.add("Edit Existing Cast");
			choices.add("Done editing");
			IOManager.printMenuOptions(choices);
			int userChoice = IOManager.getUserInputInt("\nInput choice: ", 1, choices.size());

			if (userChoice == 1) {
				String newCastName = IOManager.getUserInputString("Input the name of the cast");
				this.selectedMovie.addCast(newCastName);
				DatabaseManager.modifyMovieWithNewValues(this.selectedMovie);
				System.out.println("Saved!");
			}

			else if (userChoice == 2){
				ArrayList<String> choices2 = new ArrayList<>();
				for (String cast:this.selectedMovie.getCasts()){
					choices2.add(cast);
				}
				IOManager.printMenuOptions(choices2);
				int castChoice = IOManager.getUserInputInt("Choose the cast to delete: ",1,choices2.size());
				choices2.remove(castChoice);
				this.selectedMovie.setCast(choices2);
				DatabaseManager.modifyMovieWithNewValues(this.selectedMovie);
				System.out.println("Removed!");
			}

			else if (userChoice == 3){
				ArrayList<String> choices3 = new ArrayList<>();
				for (String cast:this.selectedMovie.getCasts()){
					choices3.add(cast);
				}
				IOManager.printMenuOptions(choices3);
				int castChoice = IOManager.getUserInputInt("Choose the cast to Edit: ",1,choices3.size());
				String newName2 = IOManager.getUserInputString("Please input the new cast name: ");
				choices3.set(castChoice - 1,newName2);
				this.selectedMovie.setCast(choices3);
				DatabaseManager.modifyMovieWithNewValues(this.selectedMovie);
				System.out.println("Edited!");
			}

			else if (userChoice == 4){
				break;
			}
		}
	}


	private void handleAddShowTime(){
		ArrayList<Cineplex> cineplexes = DatabaseManager.retrieveAllCineplexes();
		ArrayList<String> cineplexesString = new ArrayList<>();
		for (Cineplex cineplex : cineplexes){
			cineplexesString.add(cineplex.getName());
		}
		IOManager.printMenuOptions(cineplexesString);
		int userChosenCineplex = IOManager.getUserInputInt("Please choose one of the cineplexes",1,cineplexes.size());
		ArrayList<String> cinemaStrings = new ArrayList<>();
		for (Cinema cinema : cineplexes.get(userChosenCineplex - 1).getCinemas()){
			cinemaStrings.add("Cinema Code: " + cinema.getCode());
		}
		IOManager.printMenuOptions(cinemaStrings);
		int userChosenCinema = IOManager.getUserInputInt("Please choose one of the cinemas",1,cinemaStrings.size());
		LocalDate chosenDate = IOManager.getUserInputDate("Please input the date that you want to insert the show time to: ");



		int count = 1;
		for (Showtime showtime:cineplexes.get(userChosenCineplex - 1).getCinemas().get(userChosenCinema - 1).getShowtimes()){
			if (showtime.getShowDatetime().toLocalDate().equals(chosenDate)){
				if (count == 1){
					System.out.println("Here is the current showtime on this day:\n\n");
				}
				System.out.println("    " + count + ") " + showtime.getShowDatetime());
				count++;
			}
		}

		if (count != 1){

		}

		else{
			System.out.println("There is currently no show time inserted on this day");
		}

		System.out.println("What time do u want to insert it in: ");
		System.out.println("Please input the hour component (24-hour format), range (0-23)");
		int hourComponent = IOManager.getUserInputInt("",0,23);
		System.out.println("Please input the minute component (24-hour format), range (0-59)");
		int minuteComponent = IOManager.getUserInputInt("",0,59);


		System.out.println("What would you like to movie type to be? ");
		ArrayList<MovieType> movieTypeList = new ArrayList<MovieType>(EnumSet.allOf(MovieType.class));
		ArrayList<String> movieTypeListStrings = new ArrayList<String>();
		for (int x = 0 ; x < movieTypeList.size() ; x++) {
			movieTypeListStrings.add(movieTypeList.get(x).typeName());
		}
		IOManager.printMenuOptions(movieTypeListStrings);
		int typeChoice = IOManager.getUserInputInt("Input the choice: ",1,movieTypeListStrings.size());
		MovieType typeChosen = movieTypeList.get(typeChoice - 1);

		LocalDateTime chosenDateTime = chosenDate.atTime(hourComponent,minuteComponent);
		Showtime chosenShowTime = new Showtime(chosenDateTime,this.selectedMovie,cineplexes.get(userChosenCineplex - 1).getCinemas().get(userChosenCinema - 1),typeChosen);
		System.out.println(chosenDateTime.toString());
		System.out.println("Here is the show time that you have created, proceed to save?");
		int userSaveChoice = IOManager.getUserInputInt("1 - Proceed to save, 0 - Cancel",0,1);

		if (userSaveChoice == 1){
			cineplexes.get(userChosenCineplex - 1).getCinemas().get(userChosenCinema - 1).addShowTime(chosenShowTime);
			DatabaseManager.saveCineplexes(cineplexes);
		}

		//get date
		//display current showtime for that date
		//add showtime
	}

}
