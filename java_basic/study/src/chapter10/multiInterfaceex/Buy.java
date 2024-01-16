package chapter10.multiInterfaceex;

public interface Buy {
	
	// 추상 메서드
	void buy();
	
	// 디폴트 메서드
	default void order() {
		System.out.println("구매 주문");
	}
}
