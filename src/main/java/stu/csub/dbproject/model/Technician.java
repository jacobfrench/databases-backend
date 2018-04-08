package stu.csub.dbproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "technicians")
public class Technician {
	
	@Id
	@Column(name="techid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer techId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="licenseType")
	private String licenseType;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="routeid", nullable=true)
	private Route route;
	
	public Technician() {}
	
	public Technician(Integer techId, String name, String licenseType) {
		this.techId = techId;
		this.name = name;
		this.licenseType = licenseType;
		this.route = new Route();
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	


}
