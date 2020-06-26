package application;

public interface Sensor {

  boolean isOn();

  void setOn();

  void setOff();

  int read();        // returns the value of the sensor if it's on
  // if the sensor is not on throw a IllegalStateException
}
