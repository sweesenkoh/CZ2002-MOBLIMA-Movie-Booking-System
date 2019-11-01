package Controller;
import java.util.ArrayList;

import View.View;

public class ViewNavigator {
	
	private static ArrayList<View> views = new ArrayList<View>();
//	private static ViewNavigator viewNavigatorInstance = null;
	
	
	//this line make the initializer private. 
	//not supposed to be instantiated
	
	private ViewNavigator() {} 
	
	public static void pushView(View view) {
		views.add(view);
		view.activate();
	}
	
	public static void popView() {
		if (views.size() > 1) {
			views.remove(views.size() - 1);
			views.get(views.size() - 1).activate();
		}else {
			System.out.println("\n\nViews stack is empty....\n\n");
			views.get(views.size() - 1).activate();
		}
	}
	
	//pop multiple views at once 
	public static void popViews(int count) {
		for (int i = 0 ; i < count ; i++) {
			popView();
		}
	}
	
}