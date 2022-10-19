package org.Manassah.Airbase.repo;

import org.Manassah.Airbase.model.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RouteRepository extends CrudRepository<Route, Long> {

}
