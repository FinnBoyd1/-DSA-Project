/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdsaa;

/**
 *
 * @author finnb
 */
public class Owner extends Vehicle {
    private int plateNumber;
    private String driverName;

    public Owner(int plateNumber, String driverName) {
        this.plateNumber = plateNumber;
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "Owner{" + "plateNumber=" + plateNumber + ", driverName=" + driverName + '}';
    }
    
}
