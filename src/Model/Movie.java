package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable{

	private String title;
	private String director = "";
	private String synopsis = "";
	private double rating = -1.0;
	private ArrayList<Review> reviews;
	private ArrayList<String> casts;
	private MovieStatus status;

	
	public Movie(String title,MovieStatus status) {
		this.title = title;
		this.status = status;
		this.reviews = new ArrayList<Review>();
		this.casts = new ArrayList<String>();
	}
	
	public void setDirector(String directorName) {
		this.director = directorName;
	}
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public void setStatus(MovieStatus status) {
		this.status = status;
	}

	public void setTitle(String title) {this.title = title;}

	public void setCast(ArrayList<String> casts){this.casts = casts;}
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public void addCast(String cast) {
		this.casts.add(cast);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSynopsis() {
		return this.synopsis;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public ArrayList<Review> getReviews() {
		return this.reviews;
	}
	
	public MovieStatus getStatus() { 
		return this.status;
	}

	public ArrayList<String> getCasts(){ return this.casts;}
	
	public double getRating() {
		if (this.reviews.size() == 0) {return -1;}
		int count = 0;
		double rating = 0;
		for (Review review : this.reviews) {
			rating += review.getRating();
			count++;
		}
		return (rating / count);
	}
	
	public String getRatingString() {
		if (this.getRating() == -1) {
			return "NA";
		}else {
			return String.format("%.1f",this.getRating());
		}
	}
	
	public String toString() {
		String returnString = "";
		returnString += "Title: " + this.title + "\n\n";
		returnString += "Director: " + this.director + "\n\n";
		returnString += "Synopsis:\n" + this.synopsis + "\n\n";
		returnString += "Casts: ";
		for (String cast:this.casts) {
			returnString += cast + ", ";
		}
		returnString += "\n\n" + "Status: " + this.status.displayName() + "\n\n";
		returnString += "Rating: " + this.getRatingString() + "\n";
		return returnString;
	}
}
