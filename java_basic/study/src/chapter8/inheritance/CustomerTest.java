package chapter8.inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		// VIPCustomer 클래스와는 전혀 상관이 없다.
		Customer customerLee = new Customer();
		customerLee.setCustomerId(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		// 자식클래스 VIPCustomer를 이용하여, 객체를 생성시 부모클래스 Customer가 어떻게 동작되어지는지
		// new : Customer 클래스를 사용하여, 힙영역에 메모리 생성 후 VIPCustomer 클래스를 사용하여, 힙 영역에 메모리 생성
		// 
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerId(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
