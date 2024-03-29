package chapter10.multiInterfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// 할아버지 인터페이스와 자식 클래스 객체
		X xClass = mClass;
		xClass.x();
		
		// 할아버지 인터페이스와 자식 클래스 객체
		Y yClass = mClass;
		yClass.y();
		
		// 부모 인터페이스와 자식 클래스 객체
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}

}
