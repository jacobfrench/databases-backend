package stu.csub.dbproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Pest;
import stu.csub.dbproject.service.PestService;

@RestController
public class PestController {
	
	@Autowired
	private PestService pestService;
	
	//GET REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.GET, value="/pests")
	public List<Pest> getAllPests() {
		return pestService.getAllPests();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/pests/{id}")
	public Optional<Pest> getPest(@PathVariable Integer id) {
		return pestService.getPestById(id);
	}
	
	//POST REQUESTS============================================================
	@RequestMapping(method=RequestMethod.POST, value="/pests")
	public void createPest(@RequestBody Pest pest) {
		pestService.savePest(pest);
	}

	//PUT REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.PUT, value="/pests")
	public void updatePest(@RequestBody Pest pest) {
		pestService.savePest(pest);
	}
}
