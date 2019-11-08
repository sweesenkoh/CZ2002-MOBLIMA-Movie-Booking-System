package Model;

import java.io.Serializable;

public class Seat implements Serializable {
	
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

	public void unbookSeat() {booked = false;}
}
