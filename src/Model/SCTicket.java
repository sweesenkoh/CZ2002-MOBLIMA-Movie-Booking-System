
public class SCTicket extends Ticket{
	
	public SCTicket(Seat seat, Showtime showtime) {
		super(seat, showtime);
		super.setPrice(showtime.getPrice() - 3);
		//child and SC ticket price TBC
	}
}
