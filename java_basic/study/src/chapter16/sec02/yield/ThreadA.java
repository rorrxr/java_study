package chapter16.sec02.yield;

// 스레드 클래스
public class ThreadA extends Thread{

	public boolean stop = false; // 스레드 종료 목적
	public boolean work = true; // 스레드 작업 목적
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				// 실행 양보 
				Thread.yield(); // 자신의 스레드를 실행 상태에서 일시정지 상태로 만들고 cpu 제어를 다른 스레드에게 양보
			}
		}
	}
}