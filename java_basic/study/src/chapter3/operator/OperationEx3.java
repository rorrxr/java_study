package chapter3.operator;

public class OperationEx3 {
	public static void main(String[] args) {
		// 논리 연산자, && || !
		// 논리 연산자, && or || 사용시 우측의 코드가 항상 실행되는 것은 아니다. (중요)
		
		int num1 = 10;
		int i = 2;
		
		// num1에 10을 더한 값이 10보다 큰지, 그리고 i에 2를 더한 값이 10보다 큰 것을 비교
		
		// 좌측 && 우측
		// 좌측이 false이면 우측 true or false에 상관없이 결과는 false되는 구조이므로
		// 우측은 코드가 실행되지 않는다.
		boolean value = (num1 = num1 + 10) < 10 && (i = i + 2) < 10;
		// F & F = False
		// T & F = False
		// T & T = True
		
		System.out.println(value); // F & T = False
		System.out.println(num1); // 20
		// 2, boolean에서 && 앞의 num의 값이 False라서 뒤의 값이 실행되지 않았다
		System.out.println(i); // 일반적인 예상은 4로 생각할 수 있으나, && 우측 코드가 실행이 안 되어 2 값이 출력된다.
		
		// 좌측 || 우측
		// 좌측이 true이면, 우측이 true or false 상관없이 true가 되는 구조이므로
		// 우측은 코드가 실행되지 않는다.
		value = (num1 = num1 + 10) > 10 || (i + 2) < 10;
		// T || F = True
		// T || T = True
		// F || T = False
		// F || F = False
		
		System.out.println(value); // T || F = true
		System.out.println(num1); // 30
		// 2, boolean에서 || 앞의 num의 값이 False라서 뒤의 값이 실행되지 않았다
		System.out.println(i); // 일반적인 예상은 4로 생각할 수 있으나, || 우측 코드가 실행이 안 되어 2 값이 출력된다.
		

	}
}
