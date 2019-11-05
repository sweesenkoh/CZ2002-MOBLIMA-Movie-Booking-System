
public class Review {
	private String reviewer;
	private double rating;
	private String reviewContent;
	private Movie movie;
	//movie attribute required? Review is part of movie class seems like that is sufficient
	
	public Review(String name, double rate, String content, Movie movie) {
		reviewer = name;
		rating = rate;
		reviewContent = content;
		this.movie = movie;
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
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie m) {
		movie = m;
	}
}
