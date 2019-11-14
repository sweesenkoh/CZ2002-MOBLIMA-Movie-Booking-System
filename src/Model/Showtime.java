package Model;

import java.util.ArrayList;
import java.util.Date;
public class Showtime {
	private Date showtime;
	private Movie movie;
	private Cinema cinema;
	private ArrayList<Ticket> tickets;
	//should the price attribute be here instead of cinema?
	private double price;
	
	public Showtime(Date showtime, Movie movie, Cinema cinema, ArrayList<Ticket> tickets) {
		this.showtime = showtime;
		this.movie = movie;
		this.cinema = cinema;
		this.tickets = tickets;
		if (cinema.getClass() == CinemaClass.NORMAL)
			price = 5;
		else
			price = 10;
	}
	
	public Date getShowtime() {
		return showtime;
	}
	
	public void setShowtime(Date showtime) {
		this.showtime = showtime;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie() {
		this.movie = movie;
	}
	
	public Cinema getCinema() {
		return cinema;
	}
	
	public void setCinema(Cinema c) {
		cinema = c;
	}
	
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	
	public void setTickets(ArrayList<Ticket> t) {
		tickets = t;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	

}
