

import org.Manassah.Airbase.model.Passenger;
import org.Manassah.Airbase.serviceimpl.PassengerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PassengerController {
	 @Autowired
	    private PassengerServiceI passengerServiceI;
	 
	    @GetMapping("/passenger")
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
	        return "index";
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
	        return "redirect:/passenger";
	 
	    }
	}
	

	   
  