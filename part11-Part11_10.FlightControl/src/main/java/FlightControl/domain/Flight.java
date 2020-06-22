/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author thisPc Jun 22, 2020 11:21:04 PM
 */
public class Flight {

  private Airplane airplane;
  private Place departure;
  private Place target;

  public Flight(Airplane airplane, Place departure, Place target) {
    this.airplane = airplane;
    this.departure = departure;
    this.target = target;
  }

  @Override
  public String toString() {
    return String.format("%s (%d capacity) (%s-%s)",
            this.airplane.getId(), this.airplane.getCapacity(),
            this.departure, this.target);
  }

}
