package stu.csub.dbproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Technician;
import stu.csub.dbproject.service.TechnicianService;

@RestController
public class TechnicianController {
	
	@Autowired
	private TechnicianService technicianService;
	
	@RequestMapping("/techs")
	public List<Technician> getAllRoutes() { 
		return technicianService.getAllTechs();
	}
	
	

}
