package org.Manassah.Airbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
/**
* Returns an HomeController which displays the mapping of login, route, airplane, flight.
* This method always returns immediately to the ModelMap Model and it would automatically return the models
*@GetMapping maps HTTP GET request onto specific handler methods 
*
*/
@Controller
public class HomeController {
	@GetMapping(value="/login")
	public String index4(ModelMap Model) {
		return "login";
	}

	@GetMapping(value="/route")
	public String route(ModelMap Model) {
		return "route";
	}
	
	@GetMapping(value="/airplane")
	public String airplane(ModelMap Model) {
		return "airplane";
	}
	@GetMapping(value="/flight")
	public String flight(ModelMap Model) {
		return "flight";
}
}
