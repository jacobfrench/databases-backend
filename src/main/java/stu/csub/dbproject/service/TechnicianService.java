package stu.csub.dbproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stu.csub.dbproject.model.Technician;
import stu.csub.dbproject.repository.TechnicianRepository;

@Service
public class TechnicianService {
	
	@Autowired
	private TechnicianRepository technicianRepository;
	
	public List<Technician> getAllTechs() {
		List<Technician> techs = new ArrayList<>();
		technicianRepository.findAll().forEach(techs::add);
		return techs;
	}

}
