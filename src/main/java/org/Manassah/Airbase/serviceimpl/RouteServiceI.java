package org.Manassah.Airbase.serviceimpl;

import java.util.List;

import org.Manassah.Airbase.model.Route;
import org.Manassah.Airbase.repo.RouteRepository;
import org.Manassah.Airbase.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RouteServiceI implements RouteService {
	
		@Autowired private RouteRepository routeRepo;
		@Override
		public List<Route> getAllRoute() {
			return (List<Route>) routeRepo.findAll();
		}

}
