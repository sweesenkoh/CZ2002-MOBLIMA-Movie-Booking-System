import java.util.ArrayList;

public class Order {
	private ArrayList<Ticket> tickets;
	private double price;
	
	public Order(ArrayList<Ticket> t) {
		tickets = t;
		price = calculatePrice();
	}
	
	public double calculatePrice() {
		int i;
		double total;
		for (i = 0; i < tickets.size(); i++) {
			total += tickets.get(i).getPrice();
		}
		return total;
	}
	
	public void printOrder() {
		
	}
	
	
}
