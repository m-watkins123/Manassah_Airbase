package org.Manassah.Airbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
* Initializes the airplane model which sets airplane id and a model together
*
* 
*/
@Entity
@Table(name = "airplane")
public class Airplane {
	  @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long airid;
	    private String model;
	    
	    
		public Airplane(long airid, String model) {
			super();
			this.airid = airid;
			this.model = model;
		}
		public long getAirid() {
			return airid;
		}
		public void setAirid(long airid) {
			this.airid = airid;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
	   
	     
}
