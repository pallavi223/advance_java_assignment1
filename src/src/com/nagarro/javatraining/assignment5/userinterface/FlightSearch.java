
package src.com.nagarro.javatraining.assignment5.userinterface;

import java.util.Iterator;
import java.util.List;

import src.com.nagarro.javatraining.assignment5.datastructure.FlightData;
import src.com.nagarro.javatraining.assignment5.dtoclasses.FlightDTO;
import src.com.nagarro.javatraining.assignment5.flight.Flight;

public class FlightSearch {

	public List<Flight> searchUserFlight(FlightDTO dto) {

		FlightData singleton = FlightData.getInstance();
		String DepArrKey = (dto.getDepLoc() + dto.getArrLoc()).toUpperCase();
		List<Flight> flights = singleton.getDepArrivalFlights(DepArrKey);
		
		/*
		 * In the code below the data stored in the Data store is being parsed
		 * by retrieving the inner Map one by one that stores all data related
		 * to a particular csv file. It then checks if the Departure Arrival Key
		 * exists in that particular file. Then it search for the relevant
		 * flight data by comparing the user input Flight class and its date.
		 * Adds all the relevant flights in a List and set it in the dto which
		 * is further passed to the class to display the final List of Searched
		 * Flights
		 */
		Iterator<Flight> iterator = flights.iterator();
		while (iterator.hasNext()) {
			Flight flight = iterator.next();
			if (!((dto.getFlightDate().before(flight.getValid_till())) && (flight
					.getFlight_class().contains((CharSequence) dto
					.getFlightClass().toUpperCase())))) {
				iterator.remove();
			}
		}
		return flights;
	}
}
