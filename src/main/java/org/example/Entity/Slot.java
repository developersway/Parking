package org.example.Entity;

public class Slot {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean booked) {
        isBooked = booked;
    }

    private int id;

    private boolean isBooked;
}
