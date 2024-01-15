package chapter6.singleton;

// 디자인 패턴 : 싱글톤 패턴 예제
// 일반적인 클래스 : 클래스를 통하여 객체를 계속 생성할 수 있다.
// 싱글톤 클래스 : 단 하나의 객체만 생성이 가능
public class Company {
	
	// 클래스 안에서 자신의 private static 멤버로 객체를 생성.
	private static Company instance = new Company();
	
	// 생성자 (가장 중요하다)
	// private로 하면 이 클래스 파일을 벗어나 이 클래스를 접근이 불가능
	private Company() {
		
	}
	
	// public getter 메서드 정의
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
