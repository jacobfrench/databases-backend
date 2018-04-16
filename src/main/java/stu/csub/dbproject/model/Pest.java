package stu.csub.dbproject.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="pests")
public class Pest {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="commonname")
	private String commonName;
	@Column(name="phylum")
	private String phylum;
	
	@Column(name="class")
	private String _class;
	
	@ManyToMany(cascade=CascadeType.MERGE)
	private Set<Chemical> effectiveChemicals;
	
	
	
	public Pest() {}
	
	public Pest(Integer id, String commonName, String phylum, String _class) {
		this.id = id;
		this.commonName = commonName;
		this.phylum = phylum;
		this._class = _class;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<Chemical> getEffectiveChemicals() {
		return effectiveChemicals;
	}

	public void setEffectiveChemicals(Set<Chemical> effectiveChemicals) {
		this.effectiveChemicals = effectiveChemicals;
	}

	


	
	
	

}
