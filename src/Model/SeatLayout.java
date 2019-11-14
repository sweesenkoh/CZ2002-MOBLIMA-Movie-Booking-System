package Model;

public class SeatLayout {
	private int numOfRows;
	private int numOfColumns;
	private Seat[][] seats;
	private Cinema cinema;
	//maybe should link to Showtime instead of Cinema, since booked seats will differ across showtimes?
	
	SeatLayout(int rows, int cols, Cinema cinema){
		numOfRows = rows;
		numOfColumns = cols;
		this.cinema = cinema;
		seats = new Seat[rows][cols];
	}
	
	public void initialiseSeats() {
		// TBC
	}
	

}
