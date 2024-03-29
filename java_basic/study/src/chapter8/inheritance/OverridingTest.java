package chapter8.inheritance;

// 상속 시 클래스간의 형변환 (Casting)
public class OverridingTest {
	public static void main(String[] args) {
		//부모 클래스 변수로 자식객체 대입
		
		// new VIPCustomer(10030, "나몰라", 2000); 
		// => 부모 클래스 정보를 가지고 힙영역에 메모리 생성, 자식 클래스 정보를 가지고 힙 영역 메모리 생성
		
		// 타입 일치
//		Customer vc = (Customer) new VIPCustomer(10030, "나몰라", 2000);
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		
		// 부모 클래스 변수로 자식 객체를 형변환 하면, 부모 클래스 멤버만 접근 가능(중요)
		// Customer 클래스인 vc 객체로 접근이 가능한 멤버는 Customer 클래스의 멤버만 접근이 가능하다.
		// vc.멤버변수;
		// vc.멤버메서드
		
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPrice(1000));
	}
}
