package Model;

public enum CinemaClass {
	NORMAL("Normal"),
	PLATINUM("Platinum");
	
	private String cinClass;
	
	private CinemaClass(String cClass) {
		this.cinClass = cClass;
	}
	
}