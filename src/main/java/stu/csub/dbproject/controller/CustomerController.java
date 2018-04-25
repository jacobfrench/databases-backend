package stu.csub.dbproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Customer;
import stu.csub.dbproject.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	//GET REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.GET, value="/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/customers/{id}")
	public Optional<Customer> getContract(@PathVariable Integer id) {
		return customerService.getCustomerById(id);
	}
	
	//POST REQUESTS============================================================
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
	}
	
	//PUT REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.PUT, value="/customers")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}
}
