package chapter4.ifexample;

public class IfExample {
	public static void main(String[] args) {
		// 제어문 : if 구문
		
		boolean isMarried = true;
		
		// 조건식이 true이면 11번줄이 실행이 되고, false이면 실행되지 않는다.
		if(isMarried) {
			System.out.println("기혼입니다.");
		}
		
		boolean isEven;
		int num = 10;
		// num 변수의 값이 2의 배수이면 true, 아니면 false를 대입한다.
		isEven = (num % 2 == 0) ? true : false;
		System.out.println(isEven);
		
		int sum;
		int num2;
		for (num2 = 1, sum = 0; ; num2++) { // 무한루프 (;{공백];)
			sum += num2;
			if (sum > 500) break; // if 조건식이 true이면 break문이 for문을 탈출 (종료)
		}
		System.out.println(sum);
		System.out.println(num2);
		
	}
}
