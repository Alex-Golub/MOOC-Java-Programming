
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 10, 2020 8:09:55 PM
 */
public class ShoppingCart {
  
  private Map<String, Item> cart;
  
  public ShoppingCart() {
    this.cart = new HashMap<>(); // order of items not metter
  }
  
  public void add(String product, int price) {
    this.cart.putIfAbsent(product, new Item(product, 0, price));
    this.cart.get(product).increaseQuantity();
    
//    if (this.cart.containsKey(product)) {
//      this.cart.get(product).increaseQuantity();
//    } else {
//      this.cart.put(product, new Item(product, 1, price));
//    }
  }
  
  /** total price of the shopping cart */
  public int price() {
    int total = 0;
    for (Item item : this.cart.values()) {
      total += item.price();
    }
    
    return total;
  }
  
  public void print() {
    this.cart.values().forEach(System.out::println);
  }
}
