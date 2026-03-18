/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdsaa;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author finnb
 */
public class WaitingQueue implements QueueOperations{
    private Queue<Vehicle> queue = new LinkedList<>();

    public void enqueue(Vehicle vehicle){
        queue.add(vehicle);
    }

    public Vehicle dequeue(){
        return queue.poll();
    }

    public Vehicle peek(){
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void displayQueue(){

        for(Vehicle v : queue){
            System.out.println(v.printDetails());
        }
    }
}
