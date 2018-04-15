package stu.csub.dbproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stu.csub.dbproject.model.Pest;
import stu.csub.dbproject.repository.PestRepository;

@Service
public class PestService {
	
	@Autowired
	private PestRepository pestRepository;
	
	public List<Pest> getAllPests(){
		List<Pest> pests = new ArrayList<Pest>();
		pestRepository.findAll().forEach(pests::add);
		return pests;
		
	}
	
	public Optional<Pest> getPestById(Integer id) {
		return pestRepository.findById(id);
	}
	
	public void savePest(Pest pest) {
		pestRepository.save(pest);
	}
	
	

}
