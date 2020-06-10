
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jun 10, 2020 11:03:30 PM
 */
public class Herd implements Movable {

  private List<Movable> herd;

  public Herd() {
    this.herd = new ArrayList<>();
  }
  
  @Override
  public void move(int dx, int dy) {
    this.herd.forEach(m -> m.move(dx, dy));
  }
  
  public void addToHerd(Movable movable) {
    this.herd.add(movable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    this.herd.forEach(m -> sb.append(m + "\n"));
    return sb.toString();
  }

}
