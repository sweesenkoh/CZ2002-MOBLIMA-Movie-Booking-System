package Model;

import java.io.Serializable;

/**
 * Enumerates the different types of tickets.
 */
public enum TicketType implements Serializable {

    ADULT("Adult"),
    CHILD("Child"),
    SENIORCITIZEN("Senior Citizen");

	/**
	 * The types of tickets that can be bought.
	 */
    private String displayName;

    /**
     * Constant types of tickets.
     * @param displayName Type of ticket.
     */
    TicketType(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets the type of ticket.
     * @return The type of ticket.
     */
    public String displayName() { return displayName; }
}
