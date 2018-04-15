package stu.csub.dbproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stu.csub.dbproject.model.Invoice;
import stu.csub.dbproject.repository.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	public List<Invoice> getAllInvoices(){
		List<Invoice> invoices = new ArrayList<Invoice>();
		invoiceRepository.findAll().forEach(invoices::add);
		return invoices;
		
	}
	
	public Optional<Invoice> getInvoiceById(Integer id) {
		return invoiceRepository.findById(id);
	}
	
	public void saveInvoice(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

}
