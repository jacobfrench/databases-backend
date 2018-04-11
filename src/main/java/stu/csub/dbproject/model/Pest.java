package stu.csub.dbproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pests")
public class Pest {
	@Id
	@Column(name="pestid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pestId;
	
	@Column(name="commonname")
	private String commonName;
	
	@Column(name="phylum")
	private String phylum;
	
	@Column(name="class")
	private String _class;
	
	public Pest() {}
	
	public Pest(Integer pestId, String commonName, String phylum, String _class) {
		this.pestId = pestId;
		this.commonName = commonName;
		this.phylum = phylum;
		this._class = _class;
		
	}

	public Integer getPestId() {
		return pestId;
	}

	public void setPestId(Integer pestId) {
		this.pestId = pestId;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getPhylum() {
		return phylum;
	}

	public void setPhylum(String phylum) {
		this.phylum = phylum;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}
	

}
