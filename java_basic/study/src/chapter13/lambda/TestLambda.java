package chapter13.lambda;

public class TestLambda {

	public static void main(String[] args) {
		// 함수형 인터페이스를 람다식 문법으로 구현
		PrintString lambdaStr = s -> System.out.println(s);
		String str1 = "Hello";
		lambdaStr.showString(str1);
		lambdaStr.showString("Hello lambda_1");
		
		showMyString(lambdaStr); // Hello lambda_2
		PrintString reStr = returnString();
		reStr.showString("hello "); //hello world
	}
	
	// 메서드의 매개변수로 함수형 인터페이스 변수 사용 예
	public static void showMyString(PrintString p) { //메서드명 (함수형인터페이스 변수)
		p.showString("Hello lambda_2");
	}
	
	// 메서드의 리턴타입으로 함수형 인터페이스 사용 예
	public static PrintString returnString() {
		// return 추상메서드를 람다식으로 구현;
		// 리턴값이 PrinString 함수형 인터페이스의 추상메서드를 람다식으로 구현한 내용
		return s -> System.out.println(s + "world");
	}
}
