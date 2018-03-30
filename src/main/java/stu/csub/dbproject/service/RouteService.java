package stu.csub.dbproject.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stu.csub.dbproject.model.Route;
import stu.csub.dbproject.repository.RouteRepository;



@Service
public class RouteService {
	
	@Autowired
	private RouteRepository routeRepository;
	
	public List<Route> getAllRoutes() {
		List<Route> routes = new ArrayList<>();
		routeRepository.findAll().forEach(routes::add);
		return routes;
	}
	
	public Optional<Route> getRoute(Integer id) {
		return routeRepository.findById(id);
	}
	
	public void saveRoute(Route route) {
		routeRepository.save(route);
	}
	
	public void addProperty(Route route) {
		routeRepository.save(route);
		
	}
	
	public void deleteRoute(Integer routeId) {
		routeRepository.deleteById(routeId);
	}



}
