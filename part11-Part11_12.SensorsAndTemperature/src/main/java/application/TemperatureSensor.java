/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author thisPc Jun 24, 2020 5:06:02 PM
 */
public class TemperatureSensor implements Sensor {

  private boolean state;

  @Override
  public boolean isOn() {
    return state;
  }

  @Override
  public void setOn() {
    this.state = true;
  }

  @Override
  public void setOff() {
    this.state = false;
  }

  @Override
  public int read() {
    if (this.isOn()) {
      return new Random().nextInt(61) - 30;
    }

    throw new IllegalStateException("TemperatureSensor is off");
  }

}
