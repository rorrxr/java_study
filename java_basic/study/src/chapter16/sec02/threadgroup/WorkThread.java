package chapter16.sec02.threadgroup;

public class WorkThread extends Thread{

	public WorkThread(ThreadGroup threadGroup, String threadName) {
		// 상위 클래스의 생성자 호출
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + "interrupted");
				break;
			}
		}
		
		
		System.out.println(getName() + "종료됨.");
	}
}
