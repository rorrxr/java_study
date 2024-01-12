package chapter5.constructor;

// 개인정보를 관리하는 클래스
// Person 클래스가 컴파일 되면, 기본 생성자가 자동생성된다.
// Person 클래스 이름으로 만들어진 Person() {}
public class Person {
	
	String name;
	float height;
	float weight;
	
	// 컴파일 과정에서 자동으로 생성되는 기본 생성자
	// 힙 영역에 생성된 기억장소를 기본 세팅해주는 작업.
	public Person() {
		
	}
	
	// 생성자 정의, 생성자를 추가시, 컴파일 과정에서 기본 생성자는 자동 생성이 안 된다.
	// 기본 생성자를 사용하려면, 수동으로 생성해야 한다. (규칙)
	 public Person(String pname) { // 리턴 타입이란 것이 없다.
		name = pname;
	}
	
	 public Person(String pname, float pheight, float pweight) {
		 name = pname;
		 height = pheight;
		 weight = pweight;
	 }
	
}
