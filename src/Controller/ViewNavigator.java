package Controller;
import java.util.ArrayList;

import View.View;

/**
 * This class helps to manage the flow of all the View object in the application.
 * This class manages the transitioning of one View to another View, or transitioning from one View to the previous View
 */

public class ViewNavigator {
	
	private static ArrayList<View> views = new ArrayList<View>();

	private ViewNavigator() {}


	/**
	 * This method helps to push new View onto the existing View stack.
	 * Upon doing so, this new View on top of the stack is then activated to display its content
	 * @param view The View object to be pushed onto the views stack
	 */
	public static void pushView(View view) {	
		views.add(view);
		view.activate();
	}

	/**
	 * This method helps to pop the current View object that is on top of the stack
	 * Upon doing so, the next View object that is now at the top of the views stack will be activated to show its content.
	 * If the views stack only contains one View object, it will not be popped
	 */
	public static void popView() {
		if (views.size() > 1) {
			views.remove(views.size() - 1);
			views.get(views.size() - 1).activate();
		}else {
			System.out.println("\n\nViews stack is empty....\n\n");
			views.get(views.size() - 1).activate();
		}
	}

	/**
	 * This method helps to pop multiple View objects in the views stack at once.
	 * The parameter count specifies the number of View objects to be popped from the views stack
	 * @param count The number of View object to be popped from the stack at once
	 */
	public static void popViews(int count) {
		for (int i = 0 ; i < count ; i++) {
			if (views.size() > 1) {
				views.remove(views.size() - 1);
			}
		}
		views.get(views.size() - 1).activate();
	}


	/**
	 * This method will continuously pop View objects from the views stack until it founds a View object that is of the specified type at the top of the stack.
	 *
	 * @param view
	 */

	/**
	 * This method will continuously pop View objects from the views stack until it founds a View object at the top of the stack that is of the specified class type.
	 *
	 * @param viewClass The View Class that will stop the popping of views
	 */
	public static void popTillView(Class<?> viewClass){
		while (true) {
			if (views.size() > 1) {
				Class currentViewClass = views.get(views.size() - 1).getClass();
				if (!(viewClass.equals(currentViewClass))){
					views.remove(views.size() - 1);
				}else{
					break;
				}
			}else{break;}
		}
		views.get(views.size() - 1).activate();
	}

	/**
	 * This method will keep popping View object from the views stack until the views stack only contains one View object.
	 */
	public static void popToBaseView(){
		for (int x = views.size() - 1 ; x > 0 ; x--){
			views.remove(x);
		}
		views.get(0).activate();
	}
	
}
