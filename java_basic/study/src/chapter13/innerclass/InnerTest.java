package chapter13.innerclass;

// 내부 클래스

// 외부 클래스 정의
class OutClass{
	
	private int num = 10; // 외부 클래스의 private 변수
	private static int sNum = 20; // 외부 클래스의 정적 변수
	private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언
	
	// 외부 클래스 디폴트 생성자.
	// 외부 클래스가 생성된 후에 내부 클래스 생성 가능
	public OutClass() {
		inClass = new InClass(); // 내부 클래스 객체 생성
	}
	
	// 내부 클래스 정의
	// --------------------------------------------------------------------------------
	// 인스턴스 내부 클래스
	class InClass{
		int inNUm = 100; //내부 클래스의 인스턴스 변수
		static int sInNum = 200; //
		
		void inTest() {
			// 외부 클래스 필드 접근
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass num = " + sNum + "(외부 클래스의 스태틱 변수)");

		}
	}
	// --------------------------------------------------------------------------------
	
	//멤버 메서드
	public void usingClass() {
		inClass.inTest();
	}
	
	// static(정적) 내부 클래스
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");

		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//외부 클래스 객체를 생성해야, 내부 클래스 객체도 생성이 가능해진다.
		OutClass outC = new OutClass();
		
		System.out.println("외부 클래스를 이용하여 내부 클래스 기능을 호출");
		outC.usingClass(); // 내부 클래스 기능 호출
		
		System.out.println();

		// 1) 인스턴스 내부 클래스 객체 생성
		// 외부클래스.내부클래스 변수 = 외부객체.new 내부생성자();
		OutClass.InClass inClass = outC.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();
		
		// 2) 정적 내부 클래스 객체 생성
		// 외부클래스.정적내부클래스 변수 = 외부객체.new 정적내부클래스 생성자();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		
		System.out.println("정적 내부 클래스를 이용하여 일반 메서드를 호출");
		sInClass.inTest();
		
		System.out.println();
		
		System.out.println("정적 내부 클래스를 이용하여 정적 메서드를 호출");
		OutClass.InStaticClass.sTest();
	}

}
