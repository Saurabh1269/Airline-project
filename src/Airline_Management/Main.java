package Airline_Management;

public class Main {

	public static void main(String[] args) {
		
		Flight flight1 = new Flight("FN001","Nagpur","Mumbai","09:00 Am","01:00 Pm");
		
		Flight flight2 = new Flight("FN002","Pune","Hydrabad","10:00 Am","02:00 Pm");
		
		Passenger passenger1 = new Passenger("Saurabh", "P1234567");
		Passenger passenger2 = new Passenger("Gaurav", "P7654321");
		
		Airline airline = new Airline();
		airline.addFlight(flight1);
		airline.addFlight(flight2);
		
		
		airline.registerPassanger(passenger1);
		airline.registerPassanger(passenger2);
		
		airline.bookFlight("P1234567", "AA123");
		airline.bookFlight("P7654321", "BA456");
		airline.cancelBooking("P7654321", "BA456");
		
		
		System.out.println("Available Flight:");
		airline.listAvailableFlight();
		
		System.out.println("\n Booked Flights:");
		airline.listBookingFlights();

	}

}
