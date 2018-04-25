package stu.csub.dbproject.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="contracts")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	@GenericGenerator(name="system-uuid", strategy = "id")
	private Integer id;
	
	@Column(name="salesperson")
	private String salesPerson;
	
	@Column(name="servicedate")
	private String serviceDate;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="problemdesc")
	private String problemDesc;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private Property property;
	
	@ManyToMany
	@Column(name="pests")
	private Set<Pest> pests;
	
	
	
	public Contract() {};
	
	public Contract(Integer id, String salesPerson, String serviceDate) {
		this.id = id;
		this.salesPerson = salesPerson;
		this.serviceDate = serviceDate;
		this.property = new Property();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<Pest> getPests() {
		return pests;
	}

	public void setPests(Set<Pest> pests) {
		this.pests = pests;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProblemDesc() {
		return problemDesc;
	}

	public void setProblemDesc(String problemDesc) {
		this.problemDesc = problemDesc;
	}
	
	
	

}
