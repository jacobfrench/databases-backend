package stu.csub.dbproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import stu.csub.dbproject.model.Invoice;
import stu.csub.dbproject.service.InvoiceService;

@RestController
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	//GET REQUESTS=============================================================
	@RequestMapping(method=RequestMethod.GET, value="/invoices")
	public List<Invoice> getAllInvoices() {
		return invoiceService.getAllInvoices();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/invoices/{id}")
	public Optional<Invoice> getInvoice(@PathVariable Integer id) {
		return invoiceService.getInvoiceById(id);
	}
	
	
	//POST REQUESTS============================================================
	@RequestMapping(method=RequestMethod.POST, value="/invoices")
	public void createInvoice(@RequestBody Invoice invoice) {
		invoiceService.saveInvoice(invoice);
	}
	
	

}
