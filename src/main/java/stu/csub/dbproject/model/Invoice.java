package stu.csub.dbproject.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="invoices")
public class Invoice {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="date")
	private String date;
	
	@Column(name="notes")
	private String notes;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private Contract contract;
	
	@OneToMany
	@Column(name="chemical")
	private Set<Chemical> chemicalsUsed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Set<Chemical> getChemicalsUsed() {
		return chemicalsUsed;
	}

	public void setChemicalsUsed(Set<Chemical> chemicalsUsed) {
		this.chemicalsUsed = chemicalsUsed;
	}
	
	
	
	
	
	
	
	

}
