
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc Jul 3, 2020 12:10:34 PM
 */
public class Hideout<T> {

  private List<T> box;

  public Hideout() {
    this.box = new ArrayList<>();
  }

  public void putIntoHideout(T toHide) {
    if (this.box.contains(toHide)) {
      this.box.remove(toHide);
    } else {
      this.box.add(toHide);
    }
  }

  public T takeFromHideout() {
    return this.box.isEmpty() ? null : this.box.remove(this.box.size() - 1);
  }

  public boolean isInHideout() {
    return !this.box.isEmpty();
  }
}
