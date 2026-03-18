/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projectdsaa;

/**
 *
 * @author finnb
 */
public interface ParkingOperations {
    void addSpot(ParkingSpot spot);
    void removeSpot(int id );
    
    ParkingSpot findSpot(int id);
    void updateSpot(ParkingSpot spot);
    void displaySpots();
}
