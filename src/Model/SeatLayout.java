package Model;
import java.io.Serializable;
import java.util.ArrayList;

public class SeatLayout implements Serializable {
    private int numOfRows;
	private int numOfColumns;
	private Seat[] nonExistentSeats;
	private Seat[][] seats;
//	private Showtime showtime;
	//maybe should link to Showtime instead of Cinema, since booked seats will differ across showtimes?
	
//	SeatLayout(int rows, int cols, Showtime showtime){
//		numOfRows = rows;
//		numOfColumns = cols;
//		this.showtime = showtime;
//		seats = new Seat[rows][cols];
//	}

	public SeatLayout(int rows, int cols,Seat[] nonExistentSeats){
		numOfRows = rows;
		numOfColumns = cols;
		this.nonExistentSeats = nonExistentSeats;
		seats = new Seat[rows][cols];
		initialiseSeats();
	}

	public int getNumOfColumns() {
		return numOfColumns;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public void initialiseSeats() {
		// TBC
		for (int row = 0 ; row < numOfRows ; row++){
			for (int col = 0 ; col < numOfColumns ; col++){
				if (seats[row][col] == null) {
					seats[row][col] = new Seat(row,col);
				}
			}
		}

		for (Seat nonExistentSeat:this.nonExistentSeats){
			seats[nonExistentSeat.getRow()][nonExistentSeat.getCol()] = null;
		}

	}


//	outsiders count the row and column from 1 onwards
//	public void bookSeat(int row,int col){
//		if (this.seats[row-1][col-1] == null){
//			System.out.println("This seat is not among the choices");
//			return;
//		}
//		this.seats[row-1][col-1].bookSeat();
//	}

	public Seat getSeat(int row,int col){
		if (this.seats[row][col] == null){
			return null;
		}
		return this.seats[row][col];
	}

	public SeatLayout getCopy(){
		return new SeatLayout(this.numOfRows,this.numOfColumns,this.nonExistentSeats);
	}

	public void printSeatLayout(){

		int screenWidth = numOfColumns * 5 + "a a                  ".length();
		for (int x = 0 ; x < screenWidth ; x++){
			System.out.printf("-");
		}

		System.out.printf("\n");

		for (int x2 = 0 ; x2 < ((screenWidth - "Screen".length())/2) ; x2++){
			System.out.printf(" ");
		}

		System.out.printf("Screen\n");

		for (int x = 0 ; x < screenWidth ; x++){
			System.out.printf("-");
		}

		System.out.printf("\n");
		System.out.printf("       ");

		for (int z = 0 ; z < numOfColumns ; z++){
			if (z == (numOfColumns / 2)){
				System.out.printf("       ");
			}
				if ((z+1) < 10){
					System.out.printf("  %d  ",z+1);
				}else{
					System.out.printf("  %d ",z+1);
				}



		}

		System.out.printf("\n");

		Character rowChar = 'a';
		for (int row = 0 ; row < numOfRows ; row++){
			System.out.printf(rowChar + "      ");
			for (int col = 0 ; col < numOfColumns ; col++){

				if (col == (numOfColumns / 2)){
					System.out.printf("       ");
				}

				if (seats[row][col] != null) {
					if (seats[row][col].isBooked()){
						System.out.printf("[ * ]");
					}else{
						System.out.printf("[   ]");
					}
				}else{
					System.out.printf("     ");
				}
			}
			System.out.printf("      " + rowChar);
			System.out.printf("\n");
			rowChar++;
		}
	}
}
