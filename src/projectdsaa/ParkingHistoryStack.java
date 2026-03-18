/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdsaa;
import java.util.Stack;
/**
 *
 * @author finnb
 */
public class ParkingHistoryStack {
    private Stack<ParkingRecord> stack = new Stack<>();

    public void push(ParkingRecord record){
        stack.push(record);
    }

    public ParkingRecord pop(){
        return stack.pop();
    }

    public ParkingRecord peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
