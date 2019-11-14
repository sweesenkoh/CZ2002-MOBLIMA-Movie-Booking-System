package Model;

public enum MovieStatus {
	PREVIEW("Preview"),
	NOW_SHOWING("Now Showing"),
	COMING_SOON("Coming Soon");
	
	private String status;
	
	private MovieStatus(String status) {
		this.status = status;
	}
	
}