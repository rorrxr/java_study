package chapter16.sec02.priority;

public class ThreadPoriority {

	public static void main(String[] args) {
		// 모든 스레드는 우선순위가 기본값 5
		Thread threadA = new ThreadA();
		Thread threadB = new ThreadB();

		// 스레드 우선순위 설정
		threadA.setPriority(1);
		threadB.setPriority(10);
		
		threadA.start();
		threadB.start();
	}

}
