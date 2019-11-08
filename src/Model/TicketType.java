package Model;

import java.io.Serializable;

public enum TicketType implements Serializable {

    ADULT("Adult"),
    CHILD("Child"),
    SENIORCITIZEN("Senior Citizen");

    private String displayName;

    TicketType(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }
}
