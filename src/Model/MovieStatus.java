package Model;

import java.io.Serializable;

public enum MovieStatus implements Serializable{
	
	COMINGSOON("Coming Soon"),
    PREVIEW("Preview"),
	ENDED("Ended"),
	NOWSHOWING("Now Showing");

    private String displayName;

    MovieStatus(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }
}
