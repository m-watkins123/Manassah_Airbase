package org.Manassah.Airbase.serviceimpl;

import java.util.List;

import org.Manassah.Airbase.model.Flight;
import org.Manassah.Airbase.repo.FlightRepository;
import org.Manassah.Airbase.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FlightServiceI  implements FlightService{

	@Autowired private FlightRepository flightRepo;
	@Override
	public List<Flight> getAllFlight() {
		return (List<Flight>) flightRepo.findAll();
	}

}
