package Model;

public enum CinemaClass {
		NORMAL("Normal"),
		PLATINUM("Platinum");

	    private String status;

	    CinemaClass(String status) {
	        this.status = status;
	    }
	    public String getStatus() { return status; }
}
