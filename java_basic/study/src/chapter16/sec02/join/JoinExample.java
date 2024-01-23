package chapter16.sec02.join;

public class JoinExample {

	public static void main(String[] args) {
		
		//Runnable sumThread = new SumThread();
		//Thread thread = new Thread(sumThread);
		
		//thread.start();

		
		SumThread sumThread = new SumThread(); // new
		sumThread.start(); // new -> runnable 상태변경
		
		
		// thread 스레드가 완료되고나서 동작해야 한다.
		
		try {
			// 메인 스레드가 아래 구문을 실행하게 되면, 메인 스레드는 thread가 종료될 때까지는 기다리게 된다.
			//thread.join();
			sumThread.join(); // main스레드는 sumThread작업자스레드가 종료가 될때까지 대기한다.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100의 합 : " + sumThread.getSum()); // sumThread 작업자 스레드의 결과값을 사용하고자 함이 목적
	} 

}
