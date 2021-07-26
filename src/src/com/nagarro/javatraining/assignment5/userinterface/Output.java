
package src.com.nagarro.javatraining.assignment5.userinterface;

import java.util.Collections;
import java.util.List;

import src.com.nagarro.javatraining.assignment5.customexception.NewCustomException;
import src.com.nagarro.javatraining.assignment5.dtoclasses.FlightDTO;
import src.com.nagarro.javatraining.assignment5.flight.Flight;
import src.com.nagarro.javatraining.assignment5.validators.StringDateConverter;


public class Output {

	public static void outputDisplay(List<Flight> SearchedFlights, FlightDTO dto) {

		if (SearchedFlights == null) {
			System.out.println("No Flights found for given Locations");
		} else if (SearchedFlights.size() == 0) {
			System.out
					.println("Sorry No flight for this combination of Date and Class");
		} else {

			if (dto.getOutputPreferences().equalsIgnoreCase("1")) {
				Collections.sort(SearchedFlights, Flight.FareSorter);

			} else {
				Collections.sort(SearchedFlights, Flight.FareDurationSorter);
			}
			System.out.printf("\n|%-10s | %-12s |%-12s |%-15s |%-10s |\n",
					"Flight No", "Valid Till", "Flight Time",
					"Flight Duration", "Fare");

			String date = null;
			for (Flight flight : SearchedFlights) {
				try {
					date = StringDateConverter.DateToStringConvertor(flight
							.getValid_till());
				} catch (NewCustomException exception) {
					// If conversion not done successfully then converting date
					// object to String
					date = flight.getValid_till().toString();
				}
				// if user choose b than this will increase fare by 40%
				int fare = flight.getFare();
				if (dto.getFlightClass().equalsIgnoreCase("b")) {
					fare = fare + (int) (0.4 * fare);
				}
				System.out.printf("|%-10s | %-12s |%-12s |%-15s |%-10d |\n",
						flight.getFlight_no(), date, flight.getFlight_time(),
						flight.getFlight_duration(), fare);
			}
		}
	}

}
