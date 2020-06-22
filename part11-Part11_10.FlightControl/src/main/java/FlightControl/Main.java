package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.UI;

public class Main {

  public static void main(String[] args) {
    new UI(new FlightControl()).start();
  }
}
