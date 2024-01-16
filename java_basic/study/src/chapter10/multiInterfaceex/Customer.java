package chapter10.multiInterfaceex;

// 클래스는 인터페이스를 다중 상속이 가능하다.
public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	
}
