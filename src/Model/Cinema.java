package Model;

public class Cinema {
	private Cineplex cineplex;
	private CinemaClass cinemaClass;
	private int code;
	private double price;
	private Showtime[] showtimes;
	private SeatLayout seatLayout;
	
	public Cinema(Cineplex cineplex, CinemaClass cinemaClass, int code, double price, SeatLayout seatLayout) {
		this.cineplex = cineplex;
		this.cinemaClass = cinemaClass;
		this.code = code;
		this.price = price;
		this.seatLayout = seatLayout;
	}
	
	public CinemaClass getCinClass() {
		return cinemaClass;
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
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public SeatLayout getLayout() {
		return seatLayout;
	}
	
	public void setLayout(SeatLayout s) {
		seatLayout = s;
	}
}
