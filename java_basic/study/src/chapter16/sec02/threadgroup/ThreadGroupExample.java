package chapter16.sec02.threadgroup;

// 스레드 그룹 생성 및 스레드 객체 생성 예제
public class ThreadGroupExample {

	public static void main(String[] args) {
		//스레드 그룹객체
		ThreadGroup myGroup = new ThreadGroup("myGroup"); // myGroup 스레드 그룹 이용
		
		// 스레드 객체를 생성시 스레드 객체를 생성자를 통하여 매개변수에 전달.
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메서드 출력내용]");
	}

}
