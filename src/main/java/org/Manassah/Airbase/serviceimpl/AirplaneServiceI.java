package org.Manassah.Airbase.serviceimpl;

import java.util.List;

import org.Manassah.Airbase.model.Airplane;
import org.Manassah.Airbase.repo.AirplaneRepository;
import org.Manassah.Airbase.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AirplaneServiceI implements AirplaneService {
	@Autowired private AirplaneRepository airplaneRepo;
	
	@Override
	public List<Airplane> getAllAirplane() {
		return (List<Airplane>) airplaneRepo.findAll();
	}

		
	}


