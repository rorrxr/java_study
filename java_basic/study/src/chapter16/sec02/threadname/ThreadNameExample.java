package chapter16.sec02.threadname;

public class ThreadNameExample {

	public static void main(String[] args) {
		// 아래 코드가 실행이 되면, main() 메서드를 관리하는 메인 스레드 객체를 참조.
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start(); // 실행 대기상태(cpu 점유를 받을 수 있는 상태)
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName()); // 작업스레드 기본 이름
		threadB.start(); // 실행 대기 상태
	}

}
