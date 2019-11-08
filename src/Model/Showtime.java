package Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ArrayList;


public class Showtime implements Serializable {
	private LocalDateTime showDatetime;
	private Movie movie;
	private Cinema cinema;
	private MovieType movieType;
//	private ArrayList<Ticket> tickets;
	private SeatLayout seatLayout; //showtime needs a reference of seat layout to keep track of booked seats
	//should the price attribute be here instead of cinema?
//	private double price;
	
	public Showtime(LocalDateTime showDatetime, Movie movie, Cinema cinema,MovieType movieType) {
		this.showDatetime = showDatetime;
		this.movie = movie;
		this.cinema = cinema;
		this.movieType = movieType;
		this.seatLayout = this.cinema.getLayout().getCopy(); //get a copy of the seat layout, not reference!
//		this.tickets = tickets;
//		if (cinema.getCinemaClass() == CinemaClass.NORMAL)
//			price = 5;
//		else
//			price = 10;
	}
	
	public LocalDateTime getShowDatetime() {
		return showDatetime;
	}
	
	public void setShowDatetime(LocalDateTime showDatetime) {
		this.showDatetime = showDatetime;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public Cinema getCinema() {
		return cinema;
	}

	public MovieType getMovieType() {
		return movieType;
	}
	
	public void setCinema(Cinema c) {
		cinema = c;
	}

	public SeatLayout getSeatLayout() {
		return seatLayout;
	}

	public String toString(){
		String returnString = "";
		returnString += this.cinema.getCineplex().getName();

		if (this.getCinema().getCinemaClass() != CinemaClass.NORMAL){
			returnString += "   [ " + this.getCinema().getCinemaClass().name() + " ]";
		}

		returnString += "\n       ";

		if (this.movieType != MovieType.NORMAL){
			returnString += "Movie Type: " + this.movieType.typeName() + " ";
			returnString += "\n       ";
		}


		returnString += this.showDatetime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm a")) + "\n  ";
		return returnString;
	}

	//
//	public ArrayList<Ticket> getTickets() {
//		return tickets;
//	}
//
//	public void setTickets(ArrayList<Ticket> t) {
//		tickets = t;
//	}
//
//	public double getPrice() {
//		return price;
//	}
	
	

}
