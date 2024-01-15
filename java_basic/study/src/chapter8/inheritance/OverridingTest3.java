package chapter8.inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		
		// calcPrice() 메서드가 재정의
		
		int price = 10000;
		Customer customerLee = new Customer(10010, "이순신");
		
		// customerLee.calcPrice(price) : Customer 클래스(부모)의 calcPrice() 메서드가 호출
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		
		// customerKim.calcPrice(price) : VIPCustomer 클래스(자식)의 calcPrice() 메서드가 호출
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");

		// 자식 객체를 부모클래스 변수로 형변환시 부모 클래스는 자신의 클래스 멤버만 접근가능.
		Customer vc = new VIPCustomer(10030, "손흥민", 2000);
		// customerKim.calcPrice(price) 메서드가 재정의가 안 된 것이라면, Customer 클래스의 메서드로 호출됨.
		// 재정의가 된 것이라면 VIPCustomer 클래스의 메서드로 호출됨.
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPrice(price) + "원입니다.");
	}
}