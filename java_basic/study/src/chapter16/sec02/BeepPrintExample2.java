package chapter16.sec02;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// 기본 스레드와 작업자 스레드 1개 존재
		
		// 기본 스레드
		// 짝수를 출력하는 기능(메서드)를 위한 클래스 객체 생성 (새로운 스레드를 생성하여 작업)
		Runnable beepTask = new BeepTask();
		// 새로운 스레드 객체를 생성 작업. 메인 스레드로부터 독립적으로 분리.
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		// 기능 : 홀수를 출력
		
		for(int i = 0; i < 5; i++) {
		
			System.out.println("홀수");
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
