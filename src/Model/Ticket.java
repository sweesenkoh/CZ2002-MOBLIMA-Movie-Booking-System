package Model;

import java.util.ArrayList;
class Ticket {
	private double price;
	private Seat seat;
	private Showtime showtime;
	
	public Ticket(Seat seat, Showtime showtime) {
		this.seat = seat;
		this.showtime = showtime;
		price = showtime.getPrice();
	}
	
	public Seat getSeat() {
		return seat;
	}
	
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
	
	
}