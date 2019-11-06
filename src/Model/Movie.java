package Model;

import java.io.Serializable;

public class Movie implements Serializable{
	
	public enum MovieStatus{
		
		COMINGSOON("Coming Soon"),
		ENDED("Ended"),
		NOWSHOWING("Now Showing");

	    private String displayName;

	    MovieStatus(String displayName) {
	        this.displayName = displayName;
	    }

	    public String displayName() { return displayName; }
	}

	private String title;
	private MovieStatus status;

	
	public Movie(String title,MovieStatus status) {
		this.title = title;
		this.status = status;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public MovieStatus getStatus() { 
		return this.status;
	}
	
	public String toString() {
		return "Avatar (marketed as James Cameron's Avatar) is a 2009 American[7][8] epic science fiction film directed, written, produced, and co-edited by James Cameron and stars Sam Worthington, Zoe Saldana, Stephen Lang, Michelle Rodriguez, and Sigourney Weaver. The film is set in the mid-22nd century when humans are colonizing Pandora, a lush habitable moon of a gas giant in the Alpha Centauri star system, in order to mine the mineral unobtanium,[9][10] a room-temperature superconductor.[11] The expansion of the mining colony threatens the continued existence of a local tribe of Na'vi – a humanoid species indigenous to Pandora. The film's title refers to a genetically engineered Na'vi body operated from the brain of a remotely located human that is used to interact with the natives of Pandora.[12]";
	}
}
