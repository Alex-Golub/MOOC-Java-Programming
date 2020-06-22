/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Place;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thisPc Jun 22, 2020 11:25:21 PM
 */
public class FlightControl {

  private Map<String, Airplane> airplanes;
  private Map<String, Flight> flights;
  private Map<String, Place> places;

  public FlightControl() {
    this.airplanes = new HashMap<>();
    this.flights = new HashMap<>();
    this.places = new HashMap<>();
  }

  public void addAirplane(String ID, int capacity) {
    this.airplanes.putIfAbsent(ID, new Airplane(ID, capacity));
  }

  public void addFlight(Airplane plane, String departureID, String destinationID) {
    this.places.putIfAbsent(departureID, new Place(departureID));
    this.places.putIfAbsent(destinationID, new Place(destinationID));

    Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
    this.flights.put(flight.toString(), flight);
  }

  public Collection<Airplane> getAirplanes() {
    return this.airplanes.values();
  }

  public Collection<Flight> getFlights() {
    return this.flights.values();
  }

  public Airplane getAirplane(String ID) {
    return this.airplanes.get(ID);
  }
}
