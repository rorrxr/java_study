package chapter16.sec02;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// 기능
		// 기본으로 제공하는 메인 스레드에서 main() 메서드는 제어를 받는다.
		for(int i = 0; i < 5; i++) {
			System.out.println("홀수");
		}
		
		// 기능 main 메서드에 영향을 받지 않고 독립적으로 실행을 가능하게 할려면
		// 아래 코드에 새로운 스레드를 생성하여 관리받게 한다
		for (int i = 0; i < 5; i++) {
			System.out.println("짝수");
		}
	}

}
