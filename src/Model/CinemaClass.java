package Model;

import java.io.Serializable;

public enum CinemaClass implements Serializable {
		NORMAL("Normal"),
		GOLD("Gold"),
		PLATINUM("Platinum");

	    private String className;

	    CinemaClass(String className) {
	        this.className = className;
	    }
	    public String getClassName() { return className; }
}
