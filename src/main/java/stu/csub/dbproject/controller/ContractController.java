package stu.csub.dbproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Contract;
import stu.csub.dbproject.model.Route;
import stu.csub.dbproject.service.ContractService;

@RestController
public class ContractController {
	
	@Autowired
	private ContractService contractService;
	
	//GET REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.GET, value="/contracts")
	public List<Contract> getAllContracts() {
		return contractService.getAllContracts();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/contracts/{id}")
	public Optional<Contract> getContract(@PathVariable Integer id) {
		return contractService.getContractById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/opencontracts")
	public List<Contract> getOpenContracts() {
		return contractService.getOpenContracts(false);
	}
	
	
	//POST REQUESTS============================================================
	@RequestMapping(method=RequestMethod.POST, value="/contracts")
	public void createContract(@RequestBody Contract contract) {
		contractService.saveContract(contract);
	}
	
	//PUT REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.PUT, value="/contracts/{id}")
	public void updateContract(@PathVariable Integer id) {
		contractService.updateContract(id);
	}
	
	//DELETE REQUESTS==========================================================
	@RequestMapping(method=RequestMethod.DELETE, value="/contracts/{id}")
	public void deleteContract(@PathVariable Integer id) {
		contractService.deleteContract(id);
	}


}
