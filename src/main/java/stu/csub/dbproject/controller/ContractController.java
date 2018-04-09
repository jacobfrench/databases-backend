package stu.csub.dbproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Contract;
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

}
