package chapter16.sec02.threadname;

public class ThreadB extends Thread {

	// getName : 스레드 이름 확인
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
