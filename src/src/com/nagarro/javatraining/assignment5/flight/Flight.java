package src.com.nagarro.javatraining.assignment5.flight;

import java.util.Comparator;
import java.util.Date;


public class Flight{

	private String flight_no;
	private String dep_loc;
	private String arr_loc;
	private Date valid_till;
	private String flight_time;
	private String flight_duration;
	private Integer fare;
	private String seat_avail;
	private String flight_class;

	//return the flight_no
	
	public String getFlight_no() {
		return flight_no;
	}


	//parameter flight_no the flight_no to set
	
	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}


	// the dep_loc
	
	public String getDep_loc() {
		return dep_loc;
	}


	//parameter dep_loc the dep_loc to set
	
	public void setDep_loc(String dep_loc) {
		this.dep_loc = dep_loc;
	}


	 //return the arr_loc

	public String getArr_loc() {
		return arr_loc;
	}

	//parameter arr_loc the arr_loc to set

	public void setArr_loc(String arr_loc) {
		this.arr_loc = arr_loc;
	}


	//return the valid_till
	
	public Date getValid_till() {
		return valid_till;
	}


	//parameter valid_till the valid_till to set

	public void setValid_till(Date valid_till) {
		this.valid_till = valid_till;
	}


	 //return the flight_time
	
	public String getFlight_time() {
		return flight_time;
	}

		 
	//parameter flight_time the flight_time to set
	 
	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}

	
	//return the flight_duration
	
	public String getFlight_duration() {
		return flight_duration;
	}


	 //parameter flight_duration the flight_duration to set
	
	public void setFlight_duration(String flight_duration) {
		this.flight_duration = flight_duration;
	}


	//return the fare

	public Integer getFare() {
		return fare;
	}


	//parameter fare the fare to set
	 
	public void setFare(Integer fare) {
		this.fare = fare;
	}


    // return the seat_avail

	public String getSeat_avail() {
		return seat_avail;
	}


	 //parameter seat_avail the seat_avail to set
	
	public void setSeat_avail(String seat_avail) {
		this.seat_avail = seat_avail;
	}

    //return the flight_class
	
	public String getFlight_class() {
		return flight_class;
	}


	 //parameter flight_class the flight_class to set
	
	public void setFlight_class(String flight_class) {
		this.flight_class = flight_class;
	}


	
	 public static Comparator<Flight> FareSorter=  new Comparator<Flight>() {
                @Override
                public int compare(Flight obj1, Flight obj2) {
                      return obj1.getFare() - obj2.getFare();
                }
         };
     
         public static Comparator<Flight> FareDurationSorter=  new Comparator<Flight>() {
             @Override
             public int compare(Flight obj1, Flight obj2) {
            	 if (obj1.getFare().equals(obj2.getFare())) {
                     return obj1.getFlight_duration().compareTo(obj2.getFlight_duration());
              } else {
                     return obj1.getFare() - obj2.getFare();
              }
             }
      };

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((flight_class == null) ? 0 : flight_class.hashCode());
			result = prime * result
					+ ((flight_no == null) ? 0 : flight_no.hashCode());
			return result;
		}

		//sort flights
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Flight other = (Flight) obj;
			if (flight_class == null) {
				if (other.flight_class != null)
					return false;
			} else if (!flight_class.equals(other.flight_class))
				return false;
			if (flight_no == null) {
				if (other.flight_no != null)
					return false;
			} else if (!flight_no.equals(other.flight_no))
				return false;
			return true;
		}    

}
