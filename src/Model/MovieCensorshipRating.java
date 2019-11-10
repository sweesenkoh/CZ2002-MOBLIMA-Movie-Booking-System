package Model;

public enum MovieCensorshipRating {

    G("G"),
    PG("PG"),
    PG13("PG13"),
    NC16("NC16"),
    M18("M18"),
    R21("R21");

    private String displayName;

    MovieCensorshipRating(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }
}
