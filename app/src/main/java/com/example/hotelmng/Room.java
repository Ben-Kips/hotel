package com.example.hotelmng;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;

    // Constructor
    public Room() {
        // Default constructor
    }

    // Getter and Setter for 'roomNumber'
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Getter and Setter for 'roomType'
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter and Setter for 'isOccupied'
    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
