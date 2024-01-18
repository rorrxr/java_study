package chapter13.innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	// 멤버 메서드 영역 시작. 로컬 익명객체구현 작업이 가능.
	// -----------------------------------------------------
	Runnable getRunnable(int i) {
		int num = 100;
		
		// 1) 메서드 내부에 클래스 정의
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			// Runnable 인터페이스의 추상메서드 구현
			@Override
			public void run() {
				System.out.println("");
			}
		}
		
		// 2) 메서드 내부의 클래스 정의된 것을 객체로 생성하여 리턴
		return new MyRunnable();
	} // 멤버 메서드 영역 종료
	// -----------------------------------------------------
	
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
