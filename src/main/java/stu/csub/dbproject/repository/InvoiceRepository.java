package stu.csub.dbproject.repository;

import org.springframework.data.repository.CrudRepository;

import stu.csub.dbproject.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}
