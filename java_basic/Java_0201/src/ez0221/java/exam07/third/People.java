package ez0221.java.exam07.third;

public class People {
	private String name;
	private String ssn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//--- 기본 생성자 생성---
	People(){
		
	}
	
	People(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
}
