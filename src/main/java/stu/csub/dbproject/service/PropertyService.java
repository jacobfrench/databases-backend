package stu.csub.dbproject.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stu.csub.dbproject.model.Property;
import stu.csub.dbproject.repository.PropertyRepository;



@Service
public class PropertyService {
	
	@Autowired
	private PropertyRepository propertyRepository;
	

	public void saveProperty(Property property) {
		propertyRepository.save(property);
	}
	
	public List<Property> getAllProperties() {
		List<Property> properties = new ArrayList<>();
		propertyRepository.findAll().forEach(properties::add);
		return properties;
	}
	
	public Optional<Property> getProperty(Integer id) {
		return propertyRepository.findById(id);
		
	}
	
	public void deleteProperty(Integer propertyId) {
		propertyRepository.deleteById(propertyId);
	}
	

	
	

}
