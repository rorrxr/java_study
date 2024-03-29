package chapter6.thisex;

// 하나의 파일 안에서 클래스가 여러개 존재할 경우 public은 하나여야 한다.
// 그 클래스는 파일명과 같아야 한다.

// 하나의 파일 안에 클래스가 여러개 선언되어 있어도, 컴파일에 의하여 클래스 파일은 각각 생성된다.

// this : BirthDay 클래스로 생성될 힙 영역의 메모리. 즉, 인스턴스를 가리키는 의미이다. 
class BirthDay {
	int day;
	int month;
	int year;
	
	// year 필드를 위한 setter 메서드
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2024);
		
		System.out.println(bDay);
		bDay.printThis();
	}

}
