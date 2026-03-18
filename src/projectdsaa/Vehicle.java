/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdsaa;

/**
 *
 * @author finnb
 */
public class Vehicle {
    protected String VehicleType;
    protected int vehicleId;
   
    public Vehicle(){}
    public Vehicle(int vehicleId,String VehicleType){
        
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "VehicleType=" + VehicleType + ", vehicleId=" + vehicleId + '}';
    }
    
    
    
    
    
}
