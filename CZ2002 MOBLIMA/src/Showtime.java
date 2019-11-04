import java.util.Date;
public class Showtime {
	private Date showtime;
	private Movie movie;
	private Cinema cinema;
	private Ticket[] tickets;
	
	public Showtime(Date showtime, Movie movie, Cinema cinema, Ticket[] tickets) {
		this.showtime = showtime;
		this.movie = movie;
		this.cinema = cinema;
		this.tickets = tickets;
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
	
	public Ticket[] getTickets() {
		return tickets;
	}
	
	public void setTickets(Ticket[] t) {
		tickets = t;
	}
	
	

}
