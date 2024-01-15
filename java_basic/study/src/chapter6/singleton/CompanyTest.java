package chapter6.singleton;
import java.util.Calendar;

public class CompanyTest {
	public static void main(String[] args) {
		// Company에서 생성자를 private로 가지고 있기 때문에 접근할 수 없다.
		// Company com1 = new Company();
		
		// 객체를 생성
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		// com1과 com2는 동일한 객체를 참조
		System.out.println(com1 == com2); // true
		
		// jdk 날짜 관련 클래스
		Calendar cal = Calendar.getInstance();
	}
}
