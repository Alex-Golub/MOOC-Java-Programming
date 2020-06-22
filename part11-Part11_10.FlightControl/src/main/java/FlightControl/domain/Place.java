/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author thisPc Jun 22, 2020 11:28:26 PM
 */
public class Place {

  private String ID;

  public Place(String ID) {
    this.ID = ID;
  }

  @Override
  public String toString() {
    return this.ID;
  }

}
