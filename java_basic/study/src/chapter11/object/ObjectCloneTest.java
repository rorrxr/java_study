package chapter11.object;

// 객체 복사 : Cloneable 인터페이스 사용. Object 클래스 clone() 메서드 사용.
// 얕은 복사 : 클래스의 멤버 필드가 참조타입인 경우에는 주소만 복사됨.
// 깊은 복사 : Object 클래스 clone() 메서드를 재정의하며, 참조타입 필드를 새로 생성하는 작업을 처리해줘야 한다.

class Point{
	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "x = " + x + ", y= " + y;
	}
	
}
// Circle 클래스를 이용하여, 객체 생성하고, 객체 복사 작업을 하는 경우
// 반드시 Cloneable 인터페이스를 사용해야 한다. (문법 규칙)

class Circle /* extends Object */ implements Cloneable{
	Point point; // 참조타입
	int radius; // 기본데이터타입
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		// this.radius = radius;
	}

	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}
	
	// throws CloneNotSupportedException 예외 문법
	protected Object clone() throws CloneNotSupportedException{
		
		// 깊은 복사 작업
		// 복사 대상 중 참조타입에 대한 작업을 이 위치에서 해야 한다.
		
		//point = new Point(radius, radius);
		
		// 참조 타입은 주소만 복사. 힙 영역의 기억장소가 공유가 되니 깊은 복사 목적이라면 기억장소를 새로 생성
		// 기본 데이터타입은 하나씩 복사되는 메모리에 각각 생성
		Circle cloned = (Circle) super.clone(); 
		cloned.point = new Point(); //객체를 새로 생성.	깊은 복사
		
		//return super.clone();
		
		return cloned;
	}
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		
		// 객체 복사
		Circle copyCircle = (Circle) circle.clone(); // 다운 캐스팅
		
		// toString() 메서드 호출
		System.out.println(circle); // 원본 객체
		System.out.println(copyCircle); // 사본 객체
		
		// 위의 원본 객체로 값을 변경해도, 사본 객체가 힙 영역의 Point 객체의 주소를 공유하기 때문에
		// 값이 동일하게 출력된다. (얕은 복사)
		circle.point.x = 100;
		circle.point.y = 200;
		
		// Point 메모리가 새로 생성된 경우(깊은 복사) 값이 동일하지 않는다.
		System.out.println(copyCircle);
	}
}