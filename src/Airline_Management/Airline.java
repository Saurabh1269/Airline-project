package Airline_Management;

import java.util.ArrayList;

public class Airline {

	private  ArrayList<Flight> flights;
	private ArrayList<Passenger> passengers;
	
	
	public Airline() {
		
		this.flights = new ArrayList<>();
		this.passengers = new ArrayList<>();
	}
	
	
	public void addFlight(Flight flight) {
		flights.add(flight);
	}
	
	public void removeFlight(String flightNumber) {
		flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
	}
	
	public void registerPassanger(Passenger passenger) {
		passengers.add(passenger);
	}
	
	public void unregisterPassenger(String passportNumber) {
		passengers.removeIf(passenger -> passenger.getPassportNumber().equals(passportNumber));
	}
	
	
	public void bookFlight(String passportNumber, String flightNumber) {
		Flight flight = findFlight(flightNumber);
		Passenger passenger = findPassenger(passportNumber);
		if(flight != null && passenger != null && flight.getIsAvailable()) {
			passenger.bookflight(flight);
		}
	}
	
	public void cancelBooking(String passportNumber, String flightNumber) {
		Flight flight = findFlight(flightNumber);
		Passenger passenger = findPassenger(passportNumber);
		if(flight != null && passenger != null) {
			passenger.cancleBooking(flight);
		}
	}
	
	public void listAvailableFlight() {
		for(Flight flight : flights) {
			if(flight.getIsAvailable()) {
				System.out.println(flight);
			}
		}
	}
	
	public void listBookingFlights() {
		for(Flight flight : flights) {
			if(!flight.getIsAvailable()) {
				System.out.println(flight);
			}
		}
	}
	
	private Flight findFlight(String flightNumber) {
		for(Flight flight : flights) {
			if(flight.getFlightNumber().equals(flightNumber)) {
				return flight;
			}
		}
		return null;
	}
	
	
	private Passenger findPassenger(String passportNumber) {
		for(Passenger passenger : passengers) {
			if (passenger.getPassportNumber().equals(passportNumber)) {
				return passenger;
			}
		}
		return null;
	}
}
