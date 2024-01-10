package chapter2;

public class Constant {

	public static void main(String[] args) {
		// 상수 선언하기. 상수 이름은 대문자로 사용한다 (관례) 반대로 변수 이름은 소문자로 사용한다.
		// 변수와 의미가 다르다. 차이점을 공부해야 한다.
		
		// int MAX_NUM = 100; // 변수
		final int MAX_NUM = 100; // 상수
		
		// MAX_NUM = 1000; 상수값은 변수와 다르게 변경할 수 없다.
		
		final int MIN_NUM;
		
		MIN_NUM = 0;

		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

	}

}
