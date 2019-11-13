package Model;


public class ChildTicket extends Ticket {

	public ChildTicket(Seat seat, Showtime showtime) {
		super(seat, showtime);
	}

	@Override
	public double getFractionalCostOutOfOriginal() {
		return PriceConfiguration.getInstance().getChildPercentageOff();
	}

	@Override
	public String toString() {
		return "Ticket Type: Child\n" + super.toString();
	}
}
