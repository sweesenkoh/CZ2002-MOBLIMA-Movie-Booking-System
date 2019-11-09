package Controller;
import java.util.ArrayList;

import View.View;

public class ViewNavigator {
	
	private static ArrayList<View> views = new ArrayList<View>();

	//this line make the initializer private. 
	//this class is not supposed to be instantiated
	
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
			if (views.size() > 1) {
				views.remove(views.size() - 1);
			}
		}
		views.get(views.size() - 1).activate();
	}

	public static void popToBaseView(){
		for (int x = views.size() - 1 ; x > 0 ; x--){
			views.remove(x);
		}
		views.get(0).activate();
	}
	
}
