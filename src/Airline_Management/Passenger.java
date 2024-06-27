package Airline_Management;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private String passportNumber;
    private List<Flight>
bookedFlights;

public Passenger(String name,String passportNumber) {
	this.name =name;
	this.passportNumber= passportNumber;
	this.bookedFlights= new ArrayList<>();
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassportNumber() {
	return passportNumber;
}

public void setPassportNumber(String passportNumber) {
	this.passportNumber = passportNumber;
}

public List<Flight> getBookedFlights() {
	return bookedFlights;
}

public void setBookedFlights(List<Flight> bookedFlights) {
	this.bookedFlights = bookedFlights;
}
public void bookflight(Flight flight) {
	bookedFlights.add(flight);
	flight.bookFlight();
}
	
	public void cancleBooking(Flight flight) {
		bookedFlights.remove(flight);
		flight.cancleBooking();
		
	}
	@Override
	  public String toString() {
		  return "Passenger{"+
	  "name='"+ name +'\''+",passportNumber='"+passportNumber +'\''+",bookedFlights="+bookedFlights+'}';
		  
	
	  }
	 
}
