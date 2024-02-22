package ez0221.java.exam07;

public class CellPhone extends Phone{
	private String telecom;

	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	
	void powerOnCellPhone() {
		
	}

	@Override
	void powerOn() {
		System.out.println("cellphone의 전원을 켭니다.");
	}

	@Override
	void powerOff() {
		System.out.println("cellphone의 전원을 끕니다.");
	}
	
	
	

}
