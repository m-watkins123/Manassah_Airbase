package org.Manassah.Airbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
* Initializes the route model which sets route id and a route origin together
*
* 
*/
@Entity
@Table(name = "route")
public class Route {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long routeid;
    private String routeorigin;
	public Route(long routeid, String routeorigin) {
		super();
		this.routeid = routeid;
		this.routeorigin = routeorigin;
	}
	public long getRouteid() {
		return routeid;
	}
	public void setRouteid(long routeid) {
		this.routeid = routeid;
	}
	public String getRouteorigin() {
		return routeorigin;
	}
	public void setRouteorigin(String routeorigin) {
		this.routeorigin = routeorigin;
	}
    
}
