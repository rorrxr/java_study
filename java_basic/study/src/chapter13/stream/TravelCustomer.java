package chapter13.stream;

// 스트림 활용하기 - 실습 예제
public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	// 3개 파라미터를 이용한 생성자
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	// 3개 getter 메서드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}
		
	// toString() 재정의 : 3개 필드 정보 확인
	public String toString() {
		return "name : " + name + " age : " + age + " price :" + price;
	}
}
