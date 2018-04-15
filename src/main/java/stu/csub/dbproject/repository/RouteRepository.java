package stu.csub.dbproject.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stu.csub.dbproject.model.Route;


@Repository
public interface RouteRepository extends CrudRepository<Route, Integer>{
	
	
}
