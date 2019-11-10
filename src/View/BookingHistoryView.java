package View;

import java.util.ArrayList;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.Order;

public class BookingHistoryView extends View {
	
	private ArrayList<String> options = new ArrayList<>();
	private String title = "Booking History";
	private String viewContent = "Here is the list of your past bookings: Choose any one of the order to show the detailed order information";
	private String username;
	private ArrayList<Order> orders = new ArrayList<>();
	
	public BookingHistoryView(String username) {
		this.username = username;
		for (Order order : DatabaseManager.retrieveAllOrders()){
			if (order.getBuyerName().toLowerCase().equals(this.username.toLowerCase())){
				options.add(order.toSummarisedString());
				orders.add(order);
			}
		}

		this.options.add("Back to Previous Page");
	}
	
	public void activate() {
		super.setOptions(this.options);
		super.setTitle(this.title);
		super.setViewContent(this.viewContent);
		super.activate();
		
		int userInput = IOManager.getUserInputInt("Please input a choice",1,options.size());
		processUserInput(userInput);
	}

	@Override
	protected void processUserInput(int input) {
		if (input == options.size()) {
			ViewNavigator.popView();
		}else{
			String orderString = this.orders.get(input - 1).toString();
			System.out.println(orderString);
			IOManager.getUserInputString("Click any key to go back");
			this.activate();
		}

	}

}
