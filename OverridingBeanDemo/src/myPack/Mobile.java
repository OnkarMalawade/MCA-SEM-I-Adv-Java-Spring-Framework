package myPack;

public class Mobile {
	int id;
	String companyNm;
	String model;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyNm() {
		return companyNm;
	}
	public void setCompanyNm(String companyNm) {
		this.companyNm = companyNm;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", companyNm=" + companyNm + ", model=" + model + "]";
	}
}
