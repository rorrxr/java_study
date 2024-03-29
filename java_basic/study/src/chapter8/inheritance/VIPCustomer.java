package chapter8.inheritance;

// Customer 클래스를 상속받아 VIP Customer 클래스를 설계
// 자식 클래스
// super 키워드는 부모클래스를 가르킨다.
public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;

	public VIPCustomer()
	{
		// 컴파일 과정에서 super() 메서드가 생성된다.
		// 부모 클래스 Customer의 생성자를 호출. 즉 Customer()
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCusomer() 생성자 호출");
	}

	public VIPCustomer(int customerId, String customerName, int agentID){
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCusomer(int, String) 생성자 호출");
	}
	
	// 부모 클래스의 메서드명을 자식 클래스에서 동일하게 사용하여 정의
	// 메서드 재정의(오버라이딩, overriding)
	@Override
	public int calcPrice(int price){
		System.out.println("==== VIPCustomer.calcPrice ====");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	public int getAgentID(){
		return agentID;
	}

}
