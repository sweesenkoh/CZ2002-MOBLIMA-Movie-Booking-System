package Model;

import Controller.PriceManager;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Order implements Serializable {
    private ArrayList<Ticket> tickets;
	private double price; //this price should be inclusive of gst
	private String buyerName;
	private String buyerEmailAddress;
	private String TID;
	
	public Order(ArrayList<Ticket> t,String buyerName,String buyerEmailAddress) {
		tickets = t;
		price = calculatePrice();
		this.buyerName = buyerName;
		this.buyerEmailAddress = buyerEmailAddress;
		TID = this.calculateTID();
	}

	public String getBuyerName() {
		return buyerName;
	}

	public double calculatePrice() {
		int i;
		double total =0;
		for (i = 0; i < tickets.size(); i++) {
			total += tickets.get(i).getPrice();
		}
		total = PriceManager.applyGSTFactor(total);
		return total;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public String calculateTID(){
		String tidString = "";
		tidString += String.format("%03d", this.tickets.get(0).getShowtime().getCinema().getCode());
		LocalDateTime localDateTime = LocalDateTime.now();
		tidString += localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
		return tidString;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {

		String returnString = "";

		returnString += "---------------------------------------------\n";
		returnString += "                      Order                  \n";
		returnString += "---------------------------------------------\n";

		returnString += "Transaction ID: " + this.TID + "\n";
		returnString += "Buyer Name: " + this.buyerName + "\n";
		returnString += "Email Address: " + this.buyerEmailAddress + "\n\n";

		returnString += "Tickets: \n\n";

		for (Ticket ticket : this.tickets){
			returnString += ticket.toString() + "\n";
		}

		returnString += String.format("Total Price: $%.2f",this.getPrice()) + " (inclusive of GST)";

		returnString += "\n---------------------------------------------\n";

		return returnString;
	}

	public String toSummarisedString(){
		String returnString = "";

		returnString += "Transaction ID: " + this.TID + "\n";
		returnString += "     Buyer Name: " + this.buyerName + "\n";
		returnString += "     Email Address: " + this.buyerEmailAddress + "\n\n";

		returnString += "     Tickets: ";

		for (Ticket ticket : this.tickets){
			returnString += ticket.getSeat().toString() + ("  ");
		}

		returnString += String.format("\n     Total Price: $%.2f",this.getPrice()) + " (inclusive of GST)";
		returnString += "\n";

		return returnString;
	}
}
