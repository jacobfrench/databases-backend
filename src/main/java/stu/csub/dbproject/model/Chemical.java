package stu.csub.dbproject.model;

public class Chemical {
	
	private Integer chemId;
	private String name;
	private String signalWord;
	
	public Chemical() {}
	
	public Chemical(Integer chemId, String  name, String signalWord) {
		this.chemId = chemId;
		this.name = name;
		this.signalWord = signalWord;
		
	}
	
	public Integer getChemId() {
		return chemId;
	}

	public void setChemId(Integer chemId) {
		this.chemId = chemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSignalWord() {
		return signalWord;
	}

	public void setSignalWord(String signalWord) {
		this.signalWord = signalWord;
	}


}
