
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jul 3, 2020 12:28:29 PM
 */
public class Pipe<T> {
  
  // Adding to the pipe happens from one end, and taking out from the other end. 
  private Queue<T> pipe;
  
  public Pipe() {
    this.pipe = new LinkedList<>();
  }
  
  public void putIntoPipe(T value) {
    this.pipe.offer(value); // adding to end of queue
  }
  
  public T takeFromPipe() {
    // retrive first value and remove from queue, null if empty
    return this.pipe.poll(); 
  }
  
  public boolean isInPipe() {
    return this.pipe.size() > 0;
  }
}
