package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cinema implements Serializable {
    
    private Cineplex cineplex;
	private CinemaClass cinemaClass;
	private int code;
	private ArrayList<Showtime> showtimes = new ArrayList<>();
	private SeatLayout seatLayout;

	//every cinema has a fixed seat layout, has to be initialised
	public Cinema(Cineplex cineplex, CinemaClass cinemaClass, int code,SeatLayout seatLayout) {
		this.cineplex = cineplex;
		this.cinemaClass = cinemaClass;
		this.code = code;
		this.seatLayout = seatLayout;
	}
	
	public CinemaClass getCinemaClass() {
		return this.cinemaClass;
	}

	public ArrayList<Showtime> getShowtimes() {
		return showtimes;
	}

	public void addShowTime(Showtime showtime){
		this.showtimes.add(showtime);
	}

	public Cineplex getCineplex() {
		return cineplex;
	}

	public void setClass(CinemaClass c) {
		cinemaClass = c;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

	public void setShowtimes(ArrayList<Showtime> showtimes) {
		this.showtimes = showtimes;
	}

	public SeatLayout getLayout() {
		return seatLayout;
	}


}
