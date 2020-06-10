/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 10, 2020 11:21:57 PM
 */
public abstract class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void sleep() {
    System.out.println(this.getName() + " sleeps");
  }

  public void eat() {
    System.out.println(this.getName() + " eats");
  }
}
