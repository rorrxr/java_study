package chapter5.methodpart;

public class PersonTest {

	public static void main(String[] args) {
		// Person 클래스 사용
		Person ps1 = new Person(); // 기억 장소 생성
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 80;
		ps1.gender = 'M';
		ps1.married = true;
		
		//메소드 사용
		ps1.print_name(); // 리턴 타입이 없다.
		String name = ps1.getName();
		ps1.setWeight(100);
		boolean result = ps1.isWeight(85);
	}

}
