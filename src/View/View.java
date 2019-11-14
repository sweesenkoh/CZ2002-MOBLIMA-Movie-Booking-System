package View;

import java.util.ArrayList;

import Controller.IOManager;

/**
 * This is the base View class. All the subsequent views class will be the subclasses of this class.
 * This class helps to define the basic structure of View in our application.
 * A View has 3 basic components: the title, the view content as well as the options for user to choose and interact with.
 */

public abstract class View{

	/**
	 * This is the View String content
	 */
	private String viewContent = " ";

	/**
	 * This is the View title
	 */
	private String title = " ";

	/**
	 * This is the list of options available for users in the View
	 */
	private ArrayList<String> options = new ArrayList<String>();


	/**
	 * This method allows subclasses to set the view content of the View
	 * @param content The string content to be printed as the View content
	 */
	public void setViewContent(String content) {
		this.viewContent = content;
	}


	/**
	 * This method allows subclasses to set the title of the View
	 * @param title The title to be printed on top of the View
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method allows subclasses to set the View options that are available for users to interact with
	 * @param options The options to be printed for users to choose
	 */
	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}


	/**
	 * This activate method makes the View state to be active, in which the View will print out its title, menu and options in the console.
	 */
	public void activate() {
    	printViewTitle();
    	printViewContent();
    	printOptions();
    }

	/**
	 * This method helps to handle user input when user choose one of the options in the View
	 * @param input the index of the options
	 */
	protected abstract void processUserInput(int input);

	/**
	 * This method helps to print the View title
	 */
    protected void printViewTitle() {
    	IOManager.printMenuTitle(title);
    }

	/**
	 * This method helps to print the View options
	 */
	protected void printOptions() {
    	if (options.size() != 0) {
    		IOManager.printMenuOptions(options);
    	}
    }

	/**
	 * This method helps to print the View content
	 */
	protected void printViewContent() {
    	IOManager.printMenuContent(viewContent);
    }

}

