package chapter16.sec02;

// 스레드 클래스 방법 2)
public class BeepThread extends Thread {
	//run 메서드는 직접 호출하지 않는다
	@Override
	public void run() {
		//기능
		for(int i = 0; i < 5; i++) {
			System.out.println("짝수");
		}
	}
}
