package chapter16.sec02.yield;

public class YieldExample {

	public static void main(String[] args) {

		// 스레드 객체 생성. 스레드 상태 : new
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();

		// 스레드 상태 : Runnable
		threadA.start();
		threadB.start();

		// 메인 스레드가 3초간 일시정지 상태
		try { Thread.sleep(3000); } catch (InterruptedException e) { }
		threadA.work = false;

		try { Thread.sleep(3000); } catch (InterruptedException e) { }
		threadA.work = true;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) { }
		
		// 메인 스레드가 threadA, threadB 스레드 종료
		threadA.stop = true;
		threadB.stop = true;
		
		// 스레드 강제종료. 권장 안 함.
		// threadA.stop();
		// threadB.stop();
	
	}

}
