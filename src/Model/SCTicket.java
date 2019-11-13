package Model;

public class SCTicket extends Ticket {

	public SCTicket(Seat seat, Showtime showtime) {
		super(seat, showtime);
	}

	@Override
	public double getFractionalCostOutOfOriginal() {
		return PriceConfiguration.getInstance().getSeniorCitizenPercentageOff();
	}

	@Override
	public String toString() {
		return "Ticket Type: Senior Citizen\n" + super.toString();
	}
}
