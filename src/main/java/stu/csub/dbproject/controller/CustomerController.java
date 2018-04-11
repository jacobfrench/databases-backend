package stu.csub.dbproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
}
