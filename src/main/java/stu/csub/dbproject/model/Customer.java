package stu.csub.dbproject.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Customer {
	private Integer customerId;
	private String name;
	private String email;
	private Integer phoneNum;
	
	@OneToMany
	@Column(name="properties")
	@JsonIgnore
	private Set<Property> properties;

	public Customer() {}
	
	public Customer(Integer customerId, String name, String email, Integer phoneNum) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public Set<Property> getProperties() {
		return properties;
	}

	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}

}
