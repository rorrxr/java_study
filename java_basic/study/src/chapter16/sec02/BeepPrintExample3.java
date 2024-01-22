package chapter16.sec02;


public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("메인 스레드 : 홀수");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
