package stu.csub.dbproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Technician;
import stu.csub.dbproject.service.TechnicianService;

@RestController
public class TechnicianController {
	
	@Autowired
	private TechnicianService technicianService;
	
	//GET REQUESTS=============================================================
	@RequestMapping("/techs")
	public List<Technician> getAllTechnicians() { 
		return technicianService.getAllTechs();
	}
	
	@RequestMapping("/techs/{id}")
	public Optional<Technician> getTechnicianById(@PathVariable Integer id) {
		return technicianService.getTechnicianById(id);
	}
	
}
