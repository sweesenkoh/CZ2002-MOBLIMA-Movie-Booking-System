package View;

import java.util.ArrayList;
import java.util.Arrays;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.AdminUser;

public class AdminMainMenu extends View {
	
	private ArrayList<String> options = new ArrayList<>(Arrays.asList(
			"Create New Movie",
			"Update Movie Information",
			"Configure System Settings",
			"List Current Top 5 Movies",
			"Add Another Admin User to the System",
			"Back to Previous Page"
	)); 
	
	private String title = "Admin Main Menu";
	private String viewContent = "Welcome! Please select one of the options below: ";
	private boolean isAuthorised = false;


	@Override
	public void activate() {
		
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);

		if (isAuthorised){
			super.activate();
			int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
			processUserInput(userInput);
		}

		else if (this.authorisedUser()){
			super.activate();
			isAuthorised = true;
			int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
			processUserInput(userInput);
		}

		else{
			System.out.println("Credentials are not correct");
			ViewNavigator.popView();
		}


	}
	
	@Override
	protected void processUserInput(int input) {
		if (input == options.size()) {
			ViewNavigator.popView();
		}else if (input == 1) {
			ViewNavigator.pushView(new CreateNewMovieView());
		}else if (input == 2) {
			ViewNavigator.pushView(new AdminMovieBrowseOptions());
		}

		else if (input == 5){
			String userInputUsername = IOManager.getUserInputString("Please input your new username: ");
			String userInputPassword = IOManager.getUserInputString("Please input your new password");
			boolean alreadyIn = false;
			for (AdminUser adminUser:DatabaseManager.retrieveAllAdminUsers()){
				if (adminUser.getUsername().equals((new AdminUser(userInputUsername,userInputPassword)).getUsername())){
					alreadyIn = true;
					System.out.println("User already exists");
				}
			}

			if (!alreadyIn){
				DatabaseManager.saveNewAdminUser(new AdminUser(userInputUsername,userInputPassword));
				System.out.println("Saved!");
			}
		}
	}

	private boolean authorisedUser(){
		String username = IOManager.getUserInputString("Please input your username: ");
		String password = IOManager.getUserInputString("Please input your password: ");
		ArrayList<AdminUser> users = DatabaseManager.retrieveAllAdminUsers();
		boolean userIsAuthorised = false;

		for (AdminUser user: users){
			if (user.equals(new AdminUser(username,password))){
				userIsAuthorised = true;
				break;
			}
		}

		if (!userIsAuthorised){
			return false;
		}

		return true;
	}

}
