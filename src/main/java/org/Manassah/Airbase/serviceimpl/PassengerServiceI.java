package org.Manassah.Airbase.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.Manassah.Airbase.model.Passenger;
import org.Manassah.Airbase.repo.PassengerRepository;
import org.Manassah.Airbase.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceI implements PassengerService {

	@Autowired private PassengerRepository passengerRepo;
	@Override
	public List<Passenger> getAllPassenger() {
		return (List<Passenger>) passengerRepo.findAll();
	}

	@Override
	public void save(Passenger passenger) {
	
		passengerRepo.save(passenger);
	}

	@Override
	public Passenger getById(Long id) {
		 Optional<Passenger> optional = passengerRepo.findById(id);
	        Passenger passenger = null;
	        if (optional.isPresent())
	            passenger = optional.get();
	        else
	            throw new RuntimeException(
	                "Passenger not found for id : " + id);
	        return passenger;
	}

	@Override
	public void deleteViaId(long id) {
		// TODO Auto-generated method stub
		passengerRepo.deleteById(id);
	}

	
}
