package org.Manassah.Airbase.repo;

import org.Manassah.Airbase.model.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Long> {

}
