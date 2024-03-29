package chapter10.Interfaceex;

// 클래스 implements 인터페이스
// 반드시 인터페이스와 추상메서드를 모두 구현해야 한다.
// 추상메서드를 모두 구현하지 않으면, 현재 클래스는 추상클래스로 정의해야 한다.
// 상속 시 implements 사용 : 인터페이스 상속받는 클래스 
public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}
