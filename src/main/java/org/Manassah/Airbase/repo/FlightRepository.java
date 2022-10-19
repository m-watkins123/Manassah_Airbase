package org.Manassah.Airbase.repo;

import org.Manassah.Airbase.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

}
