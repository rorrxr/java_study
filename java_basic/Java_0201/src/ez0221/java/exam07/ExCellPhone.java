package ez0221.java.exam07;

public class ExCellPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		
		phone.setModel("클래식 전화기");
		phone.setColor("갈색");
		
		System.out.println("phone.getModel() : " + phone.getModel());
		System.out.println("phone.getColor() : " + phone.getColor());
		
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.setTelecom("SKT");
		cellPhone.setModel("갤럭시Z플립4");
		cellPhone.setColor("보라색");
		
		System.out.println("------------------");
		System.out.println("cellPhone.getTelecom() : " + cellPhone.getTelecom());
		System.out.println("cellPhone.getModel() : " + cellPhone.getModel());
		System.out.println("cellPhone.getColor() : " + cellPhone.getColor());
	}

}
