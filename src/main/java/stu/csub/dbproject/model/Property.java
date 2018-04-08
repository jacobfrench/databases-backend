package stu.csub.dbproject.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="properties")

public class Property {

	@Id
	@Column(name = "propid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer propertyId;
	@Column(name = "proptype")
	private String propertyType;
	@Column(name = "streetaddress")
	private String streetAddress;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zipcode")
	private String zipCode;
	@Column(name="servfreq")
	private String serviceFrequency;
	
//	@OneToOne
//	private Property nextProperty;
	

	



	public Property() {}
	
	public Property(Integer propertyId, String propertyType, String streetAddress,
					String city, String state, String zipCode, String serviceFrequency) {
		this.propertyId = propertyId;
		this.propertyType = propertyType;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.serviceFrequency = serviceFrequency;
	}
	
	public String getServiceFrequency() {
		return serviceFrequency;
	}

	public void setServiceFrequency(String serviceFrequency) {
		this.serviceFrequency = serviceFrequency;
	}

	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


}
