package Model;

public class AdultTicket extends Ticket {

    public AdultTicket(Seat seat, Showtime showtime) {
        super(seat, showtime);
    }

    @Override
    public double getFractionalCostOutOfOriginal() {
        return 1;
    }

    @Override
    public String toString() {
        return "Ticket Type: Adult\n" + super.toString();
    }
}
