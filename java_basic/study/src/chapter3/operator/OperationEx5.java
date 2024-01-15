package chapter3.operator;

public class OperationEx5 {

	public static void main(String[] args) {
		// 비트 연산자 : 일반적인 개발에서는 사용 빈도수가 적다.
		// << >> >>>
		
		// 정수형 변수 : 10진수, 16진수, 8진수, 2진수 형태로 값을 사용할 수가 있다.
		//0B(2진수) => 2진수 값으로 표현하여라
		int num = 0B10000101; // 2진수값을 8비트로 표현 
		
		System.out.println(num << 2); // num 변수의 비트 데이터가 좌측으로 2개씩 이동
		System.out.println(num >> 2); // num 변수의 비트 데이터가 우측 2개씩 이동
		//위의 코드와 차이점은 부호비트와 상관없이 무조건 0으로 채움
		System.out.println(num >>> 2); // num 변수의 비트 데이터가 우측 2개씩 이동
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}