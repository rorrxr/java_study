package chapter8.polymophism;

// 도형
class Shape{
	void draw() {
		System.out.println("draw Shape");
	}
}

// 원
class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원 입니다.");
	}
	
}

// 사각형
class Rectange extends Shape{
	@Override
	void draw() {
		System.out.println("draw Rectange");

	}
	void rectange() {
		System.out.println("사각형 입니다.");
	}
}

// 삼각형
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("draw Triangle");

	}
	void triangle() {
		System.out.println("삼각형 입니다.");
	}
}

public class ShapeTest {
	
	
	public static void main(String[] args) {
		// 1) 부모 클래스(Shape) 변수로 자식 클래스(Circle) 객체를 대입 받으면, 부모 클래스의 모든 멤버 접근(호출) 가능
		// 2) 부모 클래스의 메서드를 자식 클래스에서 재정의되었으면, 자식 클래스의 메서드가 호출된다.
		// 3) 자식 클래스의 메서드를 호출하고 싶으면, 다운캐스팅을 해야 한다.
		Shape shape1 = new Circle();
		Shape shape2 = new Rectange();
		if(shape1 instanceof Circle) { // shape1 변수가 Circle 클래스이면
			// 부모 클래스 객체로 자식 클래스의 객체에 대입
			// 다운 캐스팅 : 작은 데이타타입 = (작은 데이터타입)큰데이타타입;
			Circle c1 = (Circle) shape1;
			c1.circle();
			
			Circle c2 = new Circle();
			c2.circle();
		}
		
	}
}
