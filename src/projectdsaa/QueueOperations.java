/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projectdsaa;

/**
 *
 * @author finnb
 */
public interface QueueOperations {
    void enqueue(Vehicle vehicle);
    Vehicle dequeue();
    Vehicle peek();
 
}
