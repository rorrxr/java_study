package chapter16.sec02.priority;

/*
스레드 우선순위
: cpu 점유율 더 받을 수 있는 의미
우선순위 : 1~10 기본값 5 
 */

public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 작업자 스레드 10개 생성
		for(int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			// 10번째 스레드 객체만 우선순위 1, 1~9번째 스레드 객체는 10
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
