package chapter16.sec02.sleep;

public class SleepExample {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("작업");
			
			try {
				Thread.sleep(3000); // 메인스레드 3초마다
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
