import java.util.ArrayList;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Movie;
import View.MainMenuView;

public class Moblima {

	public static void main(String[] args) {

		ViewNavigator.pushView(new MainMenuView());

	}

}
