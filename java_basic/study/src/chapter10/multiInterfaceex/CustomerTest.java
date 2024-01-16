package chapter10.multiInterfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// 부모 인터페이스 1
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); // 재정의된 메서드 호출
		
		// 부모 인터페이스 2
		Sell seller = customer;
		seller.sell();
		seller.order(); // 재정의된 메서드 호출
		
		if(seller instanceof Customer) {
			// 다운 캐스팅
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}

}
