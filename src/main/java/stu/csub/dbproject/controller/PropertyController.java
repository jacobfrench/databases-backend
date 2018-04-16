package stu.csub.dbproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Property;
import stu.csub.dbproject.service.PropertyService;


@RestController
public class PropertyController {
	
	@Autowired
	private PropertyService propertyService;
	
	//GET REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.GET, value="/properties")
	public List<Property> getAllProperties() {
		return propertyService.getAllProperties();
	}
	@RequestMapping(method=RequestMethod.GET, value="/properties/{propertyId}")
	public Optional<Property> getProperty(@PathVariable Integer propertyId) {
		return propertyService.getProperty(propertyId);
	}
	
	//POST REQUESTS============================================================
	@RequestMapping(method=RequestMethod.POST, value="/properties")
	public void addProperty(@RequestBody Property property) {
		propertyService.saveProperty(property);
	}

	
	//PUT REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.PUT, value="/properties/{propertyId")
	public void updateProperty(@RequestBody Property property) {
		propertyService.saveProperty(property);
	}
	
	//DELETE REQUESTS==========================================================
	@RequestMapping(method=RequestMethod.DELETE, value="/properties/{propertyId}")
	public void deleteProperty(@PathVariable Integer propertyId) {
		propertyService.deleteProperty(propertyId);
	}
	

}
