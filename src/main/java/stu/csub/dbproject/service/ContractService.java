package stu.csub.dbproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stu.csub.dbproject.model.Contract;
import stu.csub.dbproject.repository.ContractRepository;

@Service
public class ContractService {
	
	@Autowired
	private ContractRepository contractRepository;
	
	public List<Contract> getAllContracts(){
		List<Contract> contracts = new ArrayList<Contract>();
		contractRepository.findAll().forEach(contracts::add);
		return contracts;
		
	}

}
