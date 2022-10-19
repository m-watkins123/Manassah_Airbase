package org.Manassah.Airbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
* Initializes the passenger model which sets passenger id and a passenger name together
*
* 
*/
@Entity
@Table(name = "passenger")
public class Passenger {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long id;
	    private String name;
	    
	    
		public Passenger(String name) {
			super();
			this.name = name;
		}
		public Passenger() {
			// TODO Auto-generated constructor stub
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	    
	  
	     
}
