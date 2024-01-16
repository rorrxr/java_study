package chapter10.multiInterfaceex;

public interface Sell {
	
	// 추상 메서드
	void sell();
	
	// 디폴트 메서드
	default void order() {
		System.out.println("구매 주문");
	}
}
