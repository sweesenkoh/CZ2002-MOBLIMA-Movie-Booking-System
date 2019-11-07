package Model;

public class Seat {
	
	private int row;
	private int col;
	private boolean booked;
	
	public Seat(int r, int c) {
		row = r;
		col = c;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol(){
		return col;
	}
	
	public boolean isBooked() {
		return booked;
	}
	
	public void bookSeat() {
		booked = true;
	}
}
