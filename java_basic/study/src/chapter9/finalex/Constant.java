package chapter9.finalex;

public class Constant {
	int num = 10; // 변수. 기억장소(주소)를 가리키는 이름
	final int NUM = 100; // 상수. 100 숫자 데이터에 이름을 부여한 의미
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50; // 변수는 새로운 값으로 변경이 가능하다.
//		cons.NUM = 200; // 상수는 값을 변경이 불가능하다.

		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
