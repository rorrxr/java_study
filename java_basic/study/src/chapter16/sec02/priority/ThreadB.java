package chapter16.sec02.priority;

// 스레드 우선순위 이해를 위한 스레드 클래스
public class ThreadB extends Thread{
	public ThreadB() {
		setName("ThreadB");
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(getName() + ":ThreadB");
		}
	}
}
