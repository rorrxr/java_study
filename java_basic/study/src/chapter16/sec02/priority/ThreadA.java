package chapter16.sec02.priority;

// 스레드 우선 순위 이해를 위한 스레드 클래스
public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	// 스레드가 CPU 점유를 받게 되면 자동으로 호출
	// 수동 호출로 사용하는 것은 아니다.
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(getName() + ":ThreadA");
		}
	}
}
