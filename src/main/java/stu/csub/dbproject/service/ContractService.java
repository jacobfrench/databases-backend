package stu.csub.dbproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	public List<Contract> getOpenContracts(boolean completed){
		List<Contract> contracts = new ArrayList<Contract>();
		contractRepository.getOpenContracts(completed).forEach(contracts::add);
		return contracts;
		
	}
	
	public Optional<Contract> getContractById(Integer id) {
		return contractRepository.findById(id);
	}
	
	public void saveContract(Contract contract) {
		contractRepository.save(contract);

		
	}
	
	public void deleteContract(Integer id) {
		contractRepository.deleteById(id);
	}
	
	public void updateContract(Integer id) {
		Optional<Contract> contract = contractRepository.findById(id);
		contract.get().setCompleted(true);
		contractRepository.save(contract.get());
	
	}
	
	

}
