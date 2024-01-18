package chapter13.lambda;

/*
// 함수형 인터페이스를 사용하면 생략 가능
public class TestMyNumber implements MyNumber{
	// 람다식을 사용하여서 코드를 간략하게 줄였다.
	public int getMax(int num1, int num2){
		if(num1 > num2){
			return num1;
		}else{
			return num2;
		}
	}
}
*/

public class TestMyNumber {
	public static void main(String[] args) {
		// MyNumber max = 추상메서드 구현 작업을 람다식으로 문법표현; 
		// MyNumber max = (매개변수) -> 실행 문장
		MyNumber max = (x, y) -> (x > y) ? x : y; // 실행문이 한줄이면 return 생략 가능
		
		System.out.println(max.getMax(10, 20));
	}
}
