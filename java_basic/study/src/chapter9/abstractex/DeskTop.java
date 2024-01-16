package chapter9.abstractex;

// 추상클래스를 상속받는 자식 클래스는 추상클래스의 추상메서드를 반드시 구현(재정의) 해야 한다는 문법 규칙
// 추상클래스
// 일반 메서드와 추상메서드를 둘 다 구성해서 만들 수 있다.
// 상속을 목적으로 한다.
// 객체를 생성할 수 없다. 예) Computer computer = new Computer(); 에러
public class DeskTop extends Computer{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Typing");

	}
	
}
