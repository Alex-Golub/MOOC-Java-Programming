/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 18, 2020 7:59:46 PM
 */
public class Literacy {

  private String gender;
  private String country;
  private int year;
  private double percent;

  public Literacy(String gender, String country, int year, double percent) {
    this.gender = gender;
    this.country = country;
    this.year = year;
    this.percent = percent;
  }

  public double getPercent() {
    return percent;
  }

  @Override
  public String toString() {
    return country + " (" + year + "), " + gender + ", " + percent;
  }
}
