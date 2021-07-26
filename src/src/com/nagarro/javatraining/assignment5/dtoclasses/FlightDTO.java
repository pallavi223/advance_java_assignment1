
package src.com.nagarro.javatraining.assignment5.dtoclasses;


import java.util.Date;



public class FlightDTO {

	private String depLoc;
	private String arrLoc;
	private Date flightDate;
	private String flightClass;
	private String outputPreferences;


	 //return the dep_loc
	 
	public String getDepLoc() {
		return depLoc;
	}
	
	 //parameter dep_loc the dep_loc to set
	
	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}
	
	//return the arr_loc
	
	public String getArrLoc() {
		return arrLoc;
	}
	
	 //parameter arrLoc the arr_loc to set
	 
	public void setArr_loc(String arrLoc) {
		this.arrLoc = arrLoc;
	}
	
	 //return the flight_date
	 
	public Date getFlightDate() {
		return flightDate;
	}
	
	  //parameter flightDate the flight_date to set
	
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	
	 //return the flight_class
	
	public String getFlightClass() {
		return flightClass;
	}
	
	//parameter flightClass the flight_class to set
	 
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	
	 //return the output_preferences
	
	public String getOutputPreferences() {
		return outputPreferences;
	}
	
	 //parameter outputPreferences the output_preferences to set

	public void setOutputPreferences(String outputPreferences) {
		this.outputPreferences = outputPreferences;
	}
	
}
