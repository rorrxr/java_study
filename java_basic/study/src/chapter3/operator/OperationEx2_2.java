package chapter3.operator;

public class OperationEx2_2 {
	public static void main(String[] args) {
		// 증감연산자, ++ or --
		// 변수 앞 또는 뒤에 사용하여, 동작 순서가 달라진다.
		
		int gameScore = 150;
		
		// gameScore변수값을 읽어와서 좌측 변수에 대입 후, gameScore에 + 1값을 한 값을 저장
		int lastScore1 = gameScore++; // 150
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore; // 150
		System.out.println(lastScore2);
		
		int myAge = 27;
		boolean value = (myAge > 25); // myAge가 25보다 큰지 아닌지 True or False로
		System.out.println(value);
		
		
	}
}
