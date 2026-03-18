/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdsaa;

/**
 *
 * @author finnb
 */
public class ParkingRecord {
   private int recordId;
    private int carPlate;
    private int spotId;
    private int timeIn;
    private int timeOut;

    public ParkingRecord(int id, int plate, int spot, int timeIn){
        this.recordId = id;
        this.carPlate = plate;
        this.spotId = spot;
        this.timeIn = timeIn;
    }

    public void setRecordId(int id){
        this.recordId = id;
    }

    public int getRecordId(){
        return recordId;
    }

    public int getCarPlate(){
        return carPlate;
    }

    public void setSpotId(int id){
        this.spotId = id;
    }

    public int getSpotId(){
        return spotId;
    }

    public String printDetails(){
        return "RecordID: " + recordId + " Plate: " + carPlate + " Spot: " + spotId;
    } 
}
