package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		 
		// 중요 : 변수끼리 연산이 발생되면, 변수의 크기가 int형보다 작은 데이터 타입이라면,
		// int 데이터 타입으로 형변환이 발생된다.
		
		// 정수 데이터 타입 : byte < short < int < long 		번외 > char

		short sVal = 10;
		byte bVal = 20;
		
		// sVal과 bVal 변수가 int형으로 변환이 된다. 
		System.out.println(sVal + bVal); // short + byte -> int + int = int 결과
		
		// int 데이터 타입 - 1) 정수형 2) 크기 : 4byte 3) 범위 -
	}

}
