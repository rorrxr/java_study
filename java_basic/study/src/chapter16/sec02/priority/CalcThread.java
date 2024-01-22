package chapter16.sec02.priority;

// 스레드로 사용할 클래스
public class CalcThread extends Thread {

	// 생성자 매개변수를 이용하여 스레드 이름 정의하기.
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2000000000; i++) {
		
		}
		System.out.println(getName());
	}
}
