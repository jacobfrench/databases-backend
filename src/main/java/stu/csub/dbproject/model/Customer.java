package stu.csub.dbproject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@Column(name = "customerid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phonenum")
	private String phoneNum;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Property> properties;
	

	public Customer() {}
	
	public Customer(Integer customerId, String name, String email, String phoneNum) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.properties = new HashSet<Property>();
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Set<Property> getProperties() {
		return properties;
	}

	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}
	


}
