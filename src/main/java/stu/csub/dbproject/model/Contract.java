package stu.csub.dbproject.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contracts")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="contractid")
	private Integer contractId;
	
	@Column(name="salesperson")
	private String salesPerson;
	
	@Column(name="servicedate")
	private String serviceDate;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Property property;
	
	public Contract() {};
	
	public Contract(Integer contractId, String salesPerson, String serviceDate) {
		this.contractId = contractId;
		this.salesPerson = salesPerson;
		this.serviceDate = serviceDate;
		this.property = new Property();
		
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public String getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
	
	

}
