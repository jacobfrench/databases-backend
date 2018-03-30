package stu.csub.dbproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Route;
import stu.csub.dbproject.service.RouteService;



@RestController
public class RouteController {
	
	@Autowired
	private RouteService routeService;
//	@Autowired
//	private PropertyService propertyService;
	
	
	//GET REQUESTS=============================================================
	@RequestMapping("/routes/{routeId}")
	public Optional<Route> getRoute(@PathVariable Integer routeId) {
		return routeService.getRoute(routeId);
	}
	
	@RequestMapping("/routes")
	public List<Route> getAllRoutes() { 
		return routeService.getAllRoutes();
	}
	
	//POST REQUESTS============================================================
	@RequestMapping(method=RequestMethod.POST, value="/routes")
	public void createRoute(@RequestBody Route route) {
		routeService.saveRoute(route);
	}
	
	//PUT REQUESTS=============================================================
//	@RequestMapping(method=RequestMethod.PUT, value="/routes/{routeId}/properties/{propertyId}")
//	public void addProperty(@PathVariable Integer routeId, @PathVariable Integer propertyId) {
//		Route route = routeService.getRoute(routeId);
//		Property property = propertyService.getProperty(propertyId);
//		route.getProperties().add(property);
//		routeService.saveRoute(route);
//	}
	
	//DELETE REQUESTS==========================================================
	@RequestMapping("delete/routes/{routeId}")
	public void deleteRoute(@PathVariable Integer routeId) {
		routeService.deleteRoute(routeId);
	}
	
	
	
	@RequestMapping("/test")
	public String test() {
		return "Testing...";
	}
	
	
	
	

}
