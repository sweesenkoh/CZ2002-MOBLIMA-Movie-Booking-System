package Model;


public class ChildTicket extends Ticket {
	public ChildTicket(Seat seat, Showtime showtime) {
		super(seat, showtime);
		super.setPrice(showtime.getPrice() - 2);
		//child and SC ticket price TBC
	}
}
