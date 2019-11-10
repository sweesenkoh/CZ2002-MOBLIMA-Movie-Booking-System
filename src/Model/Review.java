package Model;

import java.io.Serializable;

public class Review implements Serializable{
    private String reviewer;
	private double rating;
	private String reviewContent;

	public Review(String name, double rate, String content) {
		reviewer = name;
		rating = rate;
		reviewContent = content;
	}
	
	public String getReviewer() {
		return reviewer;
	}
	
	public void setReviewer(String r) {
		reviewer = r;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double r) {
		rating = r;
	}
	
	public String getContent() {
		return reviewContent;
	}
	
	public void setContent(String c) {
		reviewContent = c;
	}
	
	public String toString() {
		String returnString = "";
		returnString += "" + "Reviewer: " + this.reviewer + "\n";
		returnString += "   " + "Rating: " + String.format("%.1f",this.rating) + "\n";
		returnString += "   " + "Content: " + this.reviewContent;
		return returnString;
	}
	
}
