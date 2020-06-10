
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 8, 2020 7:17:42 PM
 */
public class Box implements Packable {

  private double maxWeight;
  private List<Packable> box;

  public Box(double maxWeight) {
    this.maxWeight = maxWeight;
    box = new ArrayList<>();
  }

  public double getMaxWeight() {
    return maxWeight;
  }

  /** weight of the total items in this box */
  public double weight() {
    double total = 0.0D;
    for (Packable p : this.getBox()) {
      total = Double.sum(total, p.weight());
    }
    
    return total;
  }
  
  public List<Packable> getBox() {
    return Collections.unmodifiableList(this.box);
  }
  
  public void add(Packable p) {
    // Get the required box weight to pack this packable
    double newWeight = Double.sum(this.weight(), p.weight());
    
    // Check if this box can fit the new Pacable object
    if (Double.compare(newWeight, this.getMaxWeight()) <= 0) {
      this.box.add(p);
    }
  }
  
  @Override
  public String toString() {
    return String.format("Box: %d items, total weight %.1f kg", 
            this.getBox().size(), this.weight());
  }
}
