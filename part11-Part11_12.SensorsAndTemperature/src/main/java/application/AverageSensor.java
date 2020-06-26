/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thisPc Jun 26, 2020 7:52:16 PM
 */
public class AverageSensor implements Sensor {

  private List<Sensor> sensors;
  private List<Integer> readings;

  public AverageSensor() {
    sensors = new ArrayList<>();
    readings = new ArrayList<>();
  }

  public void addSensor(Sensor toAdd) {
    this.sensors.add(toAdd);
  }

  @Override
  public boolean isOn() {
    return this.sensors.stream().allMatch(Sensor::isOn);
  }

  @Override
  public void setOn() {
    this.sensors.forEach(Sensor::setOn);
  }

  @Override
  public void setOff() {
    // at least one of the sensors must be set off. 
    // It's also acceptable to set off all the sensors.
    this.sensors.stream().findAny().ifPresent(Sensor::setOff);
  }

  @Override
  public int read() {
    if (!isOn() || this.sensors.isEmpty()) {
      throw new IllegalStateException("Sensors are off or no sensors were added");
    }

    Integer reading = (int) this.sensors.stream()
            .mapToInt(Sensor::read)
            .average()
            .getAsDouble();

    this.readings.add(reading);

    return reading;
  }

  public List<Integer> readings() {
    return this.readings;
  }

}
