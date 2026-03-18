/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdsaa;

/**
 *
 * @author finnb
 */
public class ParkingSpot {
    private int spotID;
    private String location;
    private boolean isAvaliable;
    private double pricePerHour;
    
    
    public ParkingSpot(){}

    public ParkingSpot(int spotID, String location, boolean isAvaliable, double pricePerHour) {
        this.spotID = spotID;
        this.location = location;
        this.isAvaliable = isAvaliable;
        this.pricePerHour = pricePerHour;
    }

    public int getSpotID() {
        return spotID;
    }

    public void setSpotID(int spotID) {
        this.spotID = spotID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" + "spotID=" + spotID + ", location=" + location + ", isAvaliable=" + isAvaliable + ", pricePerHour=" + pricePerHour + '}';
    }

    
    
}
