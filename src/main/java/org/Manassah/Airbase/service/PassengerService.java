package org.Manassah.Airbase.service;

import java.util.List;

import org.Manassah.Airbase.model.Passenger;


public interface PassengerService {
List<Passenger> getAllPassenger();
void save(Passenger passenger);
Passenger getById(Long id);
void deleteViaId(long id);
}
