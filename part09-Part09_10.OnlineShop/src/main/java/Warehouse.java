
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 8, 2020 8:48:25 PM
 */
public class Warehouse {
  
  private Map<String, Integer> namePrice;
  private Map<String, Integer> nameStock;
  
  public Warehouse() {
    this.namePrice = new HashMap<>();
    this.nameStock = new HashMap<>();
  }
  
  public void addProduct(String product, int price, int stock) {
    this.namePrice.putIfAbsent(product, price);
    this.nameStock.putIfAbsent(product, stock);
  }
  
  public int price(String product) {
    return namePrice.getOrDefault(product, -99);
  }
  
  public int stock(String product) {
    return this.nameStock.getOrDefault(product, 0);
  }
  
  public boolean take(String product) {
    if (this.stock(product) == 0) {
      return false;
    }
    
    this.nameStock.compute(product, (k, v) -> v -= 1);
    return true;
  }
  
  public Set<String> products() {
    // Don't allow users modify products set
    return Collections.unmodifiableSet(this.namePrice.keySet());
  }
  
}
