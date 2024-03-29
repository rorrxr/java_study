package chapter5.classpart;

public class PersonTest {
	public static void main(String[] args) {
		// Person 클래스 사용 - Person 객체 생성
		// 클래스 사용 방법 - 클래스명 변수명 = new 클래스명();
		
		Person ps1 = new Person(); // 기억 장소 생성
		
		ps1.name = "홍길동1";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = true;

		ps1.getPersonInfo();
		System.out.println();
		
		Person ps2 = new Person(); // 기억 장소 생성
		
		ps2.name = "홍길동2";
		ps2.height = 170;
		ps2.weight = 65;
		ps2.gender = 'F';
		ps2.married = true;

		ps2.getPersonInfo();
		System.out.println();

		Person ps3 = new Person(); // 기억 장소 생성
		
		ps3.name = "홍길동3";
		ps3.height = 185;
		ps3.weight = 70;
		ps3.gender = 'F';
		ps3.married = true;
		
		ps3.getPersonInfo();
		System.out.println();

	}
}
