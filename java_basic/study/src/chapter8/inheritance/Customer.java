package chapter8.inheritance;

// 상속 : 기존에 존재하고 있는 클래스를 새로운 클래스를 만들 때 재사용목적으로 이용하는 것
// 접근자 : private < [default] < protected < public 우측 방향
// private 접근자느 상속 안 됨
// protected 접근자 : 상속 접근자
// 위의 접근자 설명 : 다른 패키지에서 상속 시 public
// 다른 패키지에서 상속이 아닌 그냥 사용할 경우에는 private
// 부모 클래스
public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; // 접근자 default
	double bonusRatio; // 접근자 default
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");

	}
	
	public Customer(int customerID, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
			   bonusPoint + "입니다.";
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
