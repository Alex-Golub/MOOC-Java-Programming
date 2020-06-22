/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author thisPc Jun 22, 2020 11:38:10 PM
 */
public class UI {

  private Scanner scanner;
  private FlightControl flightControl;

  public UI(FlightControl flightControl) {
    this.flightControl = flightControl;
    this.scanner = new Scanner(System.in);
  }

  public void start() {
    startAssetControl();
    System.out.println();
    startFlightControl();
    System.out.println();
  }

  private void startAssetControl() {
    System.out.println("Airport Asset Control");
    boolean exit = false;
    while (!exit) {
      System.out.println("Choose an action:");
      System.out.println("[1] Add an airplane");
      System.out.println("[2] Add a flight");
      System.out.println("[x] Exit Airport Asset Control");

      System.out.print("> ");
      String answer = scanner.nextLine();

      switch (answer) {
        case "1":
          addAirplane();
          break;
        case "2":
          addFlight();
          break;
        case "x":
          exit = true;
          break;
      }
    }
  }

  private void addAirplane() {
    System.out.print("Give the airplane id: ");
    String id = scanner.nextLine();
    System.out.print("Give the airplane capacity: ");
    int capacity = Integer.parseInt(scanner.nextLine());

    this.flightControl.addAirplane(id, capacity);
  }

  private void addFlight() {
    System.out.print("Give the airplane id: ");
    Airplane airplane = askForAirplane();
    System.out.print("Give the departure airport id: ");
    String departureID = scanner.nextLine();
    System.out.print("Give the target airport id: ");
    String destinationID = scanner.nextLine();

    this.flightControl.addFlight(airplane, departureID, destinationID);
  }

  private void startFlightControl() {
    System.out.println("Flight Control");
    boolean exit = false;
    while (!exit) {
      System.out.println("Choose an action:");
      System.out.println("[1] Print airplanes");
      System.out.println("[2] Print flights");
      System.out.println("[3] Print airplane details");
      System.out.println("[x] Quit");

      System.out.print("> ");
      String answer = scanner.nextLine();

      switch (answer) {
        case "1":
          printAirplanes();
          break;
        case "2":
          printFlights();
          break;
        case "3":
          printAirplaneDetails();
          break;
        case "x":
          exit = true;
          break;
      }
    }
  }

  private void printAirplanes() {
    this.flightControl.getAirplanes()
            .forEach(System.out::println);
  }

  private void printFlights() {
    this.flightControl.getFlights()
            .forEach(System.out::println);
    System.out.println();
  }

  private void printAirplaneDetails() {
    System.out.print("Give the airplane id: ");
    Airplane plane = askForAirplane();
    System.out.println(plane);
    System.out.println();
  }

  private Airplane askForAirplane() {
    Airplane airplane = null;
    while (airplane == null) {
      String id = scanner.nextLine();
      airplane = flightControl.getAirplane(id);

      if (airplane == null) {
        System.out.println("No airplane with the id " + id + ".");
      }
    }

    return airplane;
  }
}
