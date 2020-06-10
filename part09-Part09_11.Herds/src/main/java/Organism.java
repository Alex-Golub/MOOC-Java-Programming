/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 10, 2020 10:59:33 PM
 */
public class Organism implements Movable {
  
  private int x;
  private int y;

  public Organism(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  @Override
  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }
    
    final Organism other = (Organism) obj;
    if (this.x != other.x || this.y != other.y) {
      return false;
    }
    
    return true;
  }
  
  @Override
  public String toString() {
    return String.format("x: %d; y: %d", this.x, this.y);
  }
  
}
