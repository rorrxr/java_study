package chapter10.Interfaceex;

// 인터페이스
// 상속 목적
// 추상 메서드로 구성. 즉 일반 메서드는 사용 불가능

public interface Calc {
	// 구성요소
	// 상수, 추상메서드, default 메서드, static 메서드 - jdk 1.8
	// private 메서드 - jdk 1.9

	// 상수. final compile 하면 public final static 자동생성
	double PI = 3.14;
	int ERROR = -999999999;

	// 추상 메서드 compile 하면 public abstract 자동생성
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 일반 메서드는 사용 불가능
//	void aaa() {
//		
//	}
	
	// jdk 1.8부터는 default static메서드가 지원됨
	default void description() {
		
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다");
	}
	
	//jdk 1.9
	private void myMethod() {
		System.out.println("private 메서드입니다");

	}
}