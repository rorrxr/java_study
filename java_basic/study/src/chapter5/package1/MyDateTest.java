package chapter5.package1;


public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate(); //객체 생성 구문
		
		// 아래 필드가 접근이 가능한 이유는
		// 패키지가 같은 상태에서 접근자가 default 일때는 public처럼 사용, 접근 가능
		date.month = 2;
		date.day = 31;
		date.year = 2024;
		
	}

}
