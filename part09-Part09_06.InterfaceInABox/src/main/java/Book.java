/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 8, 2020 7:06:51 PM
 */
public class Book implements Packable {

  private String author;
  private String name;
  private double weight;

  public Book(String author, String name, double weight) {
    this.author = author;
    this.name = name;
    this.weight = weight;
  }

  public String getAuthor() {
    return author;
  }

  public String getName() {
    return name;
  }

  @Override
  public double weight() {
    return weight;
  }

  @Override
  public String toString() {
    return String.format("%s: %s", getAuthor(), getName());
  }

}
