/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdsaa;

/**
 *
 * @author finnb
 */
public class ParkingLinkedList implements ParkingOperations {
    private Node head;
    
     public ParkingLinkedList(){
        head = null;
    }

    public void addSpot(ParkingSpot spot){

        Node newNode = new Node(spot);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(newNode);
    }

    public void removeSpot(int id){

        Node temp = head;
        Node prev = null;

        while(temp != null){

            if(temp.getSpot().getSpotId() == id){

                if(prev == null)
                    head = temp.getNext();
                else
                    prev.setNext(temp.getNext());

                return;
            }

            prev = temp;
            temp = temp.getNext();
        }
    }

    public ParkingSpot findSpot(int id){

        Node temp = head;

        while(temp != null){

            if(temp.getSpot().getSpotID() == id)
                return temp.getSpot();

            temp = temp.getNext();
        }

        return null;
    }

    public void updateSpot(ParkingSpot spot){

        Node temp = head;

        while(temp != null){

            if(temp.getSpot().getSpotID() == spot.getSpotID()){
                temp.setSpot(spot);
                return;
            }

            temp = temp.getNext();
        }
    }

    public void displaySpots(){

        Node temp = head;

        while(temp != null){
            System.out.println(temp.getSpot().printDetails());
            temp = temp.getNext();
        }
    }
}
