package stu.csub.dbproject.model;

public class Pest {
	private Integer pestId;
	private String commonName;
	private String phylum;
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
