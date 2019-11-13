package Model;

import Controller.TicketPriceManager;

import java.io.Serializable;
import java.util.ArrayList;
public abstract class Ticket implements Serializable {

	private double fractionalCostOutOfOriginal;
	private double price;
	private Seat seat;
	private Showtime showtime;
//	private TicketType ticketType;
	
//	public Ticket(Seat seat, Showtime showtime,TicketType ticketType) {
//		this.seat = seat;
//		this.showtime = showtime;
//		this.ticketType = ticketType;
//		price = this.calculateTicketPrice();
//	}

	public Ticket(Seat seat, Showtime showtime) {
		this.seat = seat;
		this.showtime = showtime;
		price = this.calculateTicketPrice();
	}

	public abstract double getFractionalCostOutOfOriginal(); //subclass must configure the percentage discount

	private double calculateTicketPrice(){
		return TicketPriceManager.calculateTicketPrice(this);
	}
	
	public Seat getSeat() {
		return seat;
	}
//
//	public TicketType getTicketType(){ return ticketType; }
//
	public void setSeat(Seat s) {
		seat = s;
	}
	
	public Showtime getShowtime() {
		return showtime;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double p) {
		price = p;
	}

	public String toString(){
		String returnString = "";
		returnString += "Seat ID: "+this.getSeat().toString() + "\n";
//		returnString += "Ticket Type: " + this.getTicketType().displayName() + "\n";
		returnString += "Price: $" + String.format("%.2f",this.getPrice()) + "\n";
		returnString += "Show Time: \n       " + this.getShowtime().toString();
		return  returnString;
	}
	
	
}