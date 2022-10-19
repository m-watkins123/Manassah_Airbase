package org.Manassah.Airbase.controller;

import org.Manassah.Airbase.model.Passenger;
import org.Manassah.Airbase.serviceimpl.PassengerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
* Returns an PassengerController which displays the mapping of viewhomepage, addnew, save, showFormForUpdate.
* PathVaraiable shows the value of the id of the passenger
* This method always returns immediately. 
*@PostMapping maps HTTP Post request onto specfic handler methods 
*@GetMapping maps HTTP GET request onto specfic handler methods 
*
*/
@Controller
public class PassengerController {
	 @Autowired
	    private PassengerServiceI passengerServiceI;
	 
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("allpassengerlist", passengerServiceI.getAllPassenger());
	        return "index";
	    }
	 
	    @GetMapping("/addnew")
	    public String addNewPassenger(Model model) {
	        Passenger passenger = new Passenger();
	        model.addAttribute("passenger", passenger);
	        return "newpassenger";
	    }
	    	
	    @PostMapping("/save")
	    public String savePassenger(@ModelAttribute("passenger") Passenger passenger) {
	        passengerServiceI.save(passenger);
	        return "redirect:/";
	    }
	 
	    @GetMapping("/showFormForUpdate/{id}")
	    public String updateForm(@PathVariable(value = "id") long id, Model model) {
	        Passenger passenger = passengerServiceI.getById(id);
	        model.addAttribute("passenger", passenger);
	        return "update";
	    }
	 
	    @GetMapping("/deletePassenger/{id}")
	    public String deleteThroughId(@PathVariable(value = "id") long id) {
	        passengerServiceI.deleteViaId(id);
	        return "redirect:/";
	 
	    }
	}
	

	   
  