package stu.csub.dbproject.model;

public class Contract {
	private Integer contractId;
	private String salesPerson;
	private String serviceDate;
	
	public Contract() {};
	
	public Contract(Integer contractId, String salesPerson, String serviceDate) {
		this.contractId = contractId;
		this.salesPerson = salesPerson;
		this.serviceDate = serviceDate;
		
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
	
	

}
