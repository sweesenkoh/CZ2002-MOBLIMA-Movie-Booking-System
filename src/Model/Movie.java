package Model;
import java.util.ArrayList;

public class Movie {

	private String title;
	private String director;
	private String synopsis;
	private ArrayList<String> cast;
	private MovieStatus status;
	private double rating;
	private ArrayList<Review> reviews;

	
	public Movie(String title, String director, String synopsis, ArrayList<String> cast, MovieStatus status) {
		this.title = title;
		this.director = director;
		this.synopsis = synopsis;
		this.cast = cast;
		this.status = status;
		rating = 0;
		reviews = new ArrayList<Review>();
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String t) {
		title  = t;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public void setDirector(String d) {
		director = d;
	}
	
	public String getSynopsis() {
		return this.synopsis;
	}
	
	public void setSynopsis(String s) {
		synopsis = s;
	}
	
	public MovieStatus getStatus() {
		return status;
	}
	public void setStatus(MovieStatus m) { 
		status = m;
	}
	
	public double getRating() {
		int i;
		double total = 0;
		for (i=0; i<reviews.size(); i++) {
			total += reviews.get(i).getRating();
		}
		return total/reviews.size();
	}
	
	public void addReview(Review r) {
		reviews.add(r);
	}
	
	public String toString() {
		return "Avatar (marketed as James Cameron's Avatar) is a 2009 American[7][8] epic science fiction film directed, written, produced, and co-edited by James Cameron and stars Sam Worthington, Zoe Saldana, Stephen Lang, Michelle Rodriguez, and Sigourney Weaver. The film is set in the mid-22nd century when humans are colonizing Pandora, a lush habitable moon of a gas giant in the Alpha Centauri star system, in order to mine the mineral unobtanium,[9][10] a room-temperature superconductor.[11] The expansion of the mining colony threatens the continued existence of a local tribe of Na'vi – a humanoid species indigenous to Pandora. The film's title refers to a genetically engineered Na'vi body operated from the brain of a remotely located human that is used to interact with the natives of Pandora.[12]";
	}
}
