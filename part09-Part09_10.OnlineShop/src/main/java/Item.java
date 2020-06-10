/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 10, 2020 8:01:47 PM
 */
public class Item {
  
  private String product;
  private int quntity; //  how many of the product are in the item
  private int unitPrice; // price of a single product.

  public Item(String product, int quntity, int unitPrice) {
    this.product = product;
    this.quntity = quntity;
    this.unitPrice = unitPrice;
  }
  
  public int price() {
    return this.quntity * this.unitPrice;
  }

  public void increaseQuantity() {
    this.quntity++;
  }
  
  @Override
  public String toString() {
    return String.format("%s: %d", this.product, this.quntity);
  }
  
}
