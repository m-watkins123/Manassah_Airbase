package org.Manassah.Airbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
* Initializes the flight model which sets flight id and a flight name together
*
* 
*/
@Entity
@Table(name = "flight")
public class Flight {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long flightid;
	    private String flightname;
		public Flight(long flightid, String flightname) {
			super();
			this.flightid = flightid;
			this.flightname = flightname;
		}
		public long getFlightid() {
			return flightid;
		}
		public void setFlightid(long flightid) {
			this.flightid = flightid;
		}
		public String getFlightname() {
			return flightname;
		}
		public void setFlightname(String flightname) {
			this.flightname = flightname;
		}
	    
	    
}
