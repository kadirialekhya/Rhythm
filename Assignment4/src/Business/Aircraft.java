/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Apeksha
 */
public class Aircraft {
    private String aircraftName;
    private String aircraftHeadquaters;
    private int aircraftCapacity;
    public ArrayList<Flight> flightList;
    
    public Aircraft(String Name, String headquaters)
    {
       flightList = new ArrayList<Flight>();
       this.aircraftName = Name;
       this.aircraftHeadquaters = headquaters;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public String getAirlinerName() {
        return aircraftName;
    }

    public void setAirlinerName(String airlinerName) {
        this.aircraftName = airlinerName;
    }

    public String getAirlinerHeadquaters() {
        return aircraftHeadquaters;
    }

    public void setAirlinerHeadquaters(String airlinerHeadquaters) {
        this.aircraftHeadquaters = airlinerHeadquaters;
    }

    public int getAirlinerFleetSize() {
        return aircraftCapacity;
    }

    public void setAirlinerFleetSize(int airlinerFleetSize) {
        this.aircraftCapacity = airlinerFleetSize;
    }
    
    public Flight addFlight(String airlinerName, String flightNumber, String source, String destination, String departureTime, String arrivalTime, double flightPrice, int totalSeats) {
       Flight flight = new Flight(airlinerName, flightNumber, source, destination, departureTime, arrivalTime, flightPrice, totalSeats);
       flightList.add(flight);
       return flight;
    }
    
    public void deleteFlight(Flight flight) {
        flightList.remove(flight);
    }
     
     
    @Override
    public String toString() {
        return aircraftName;
    }
}
