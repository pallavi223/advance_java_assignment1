
package src.com.nagarro.javatraining.assignment5.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import src.com.nagarro.javatraining.assignment5.flight.Flight;


public class FlightData {
	
	 //Instance of Singleton Class
	 
	private static FlightData singletonInstance;
	/*
	 * Map to store Filenames as the Key and a Sub map as a value. Further that
	 * inner map stores Departure Arrival String as key and Set of relative
	 * Flights form that particular CSV file as its value
	 */
	//comparator - used for sorted eg: flight1>flight2 than return 1 else 0
	private Map<String, Map<String, Set<Flight>>> flightDataCollection = new HashMap<String, Map<String, Set<Flight>>>();

	public static synchronized FlightData getInstance() {
		if (null == singletonInstance) {
			singletonInstance = new FlightData();
		}
		return singletonInstance;
	}
	
	public void insertCsvFileData(String filename, Map<String, Set<Flight>> flightData){
		if(filename!=null && flightData!= null){
			flightDataCollection.put(filename, flightData);
		}
	}
	
	public List<Flight> getDepArrivalFlights(String DepArrKey){
		List<Flight> SearchedFlights = new ArrayList<>();
		
		for (Map.Entry<String, Map<String, Set<Flight>>> localMap : flightDataCollection.entrySet()) {
			for (Map.Entry<String, Set<Flight>> innerMap : localMap.getValue()
					.entrySet()) {

				if (innerMap.getKey().equalsIgnoreCase(DepArrKey)) {
					SearchedFlights.addAll(innerMap.getValue());
				}
			}
		}
		return SearchedFlights;
	}
}
