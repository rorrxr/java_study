package chapter11.string;

// String 클래스 : 문자열 데이터작업
// 기본데이터타입 char : 문자 1개 작업
public class StringTest1 {
	public static void main(String[] args) {
		// 1) 사용법 1. 참조 타입 사용법

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 주소 비교. "false"
		System.out.println(str1.equals(str2)); // 데이타 비교. true
		
		// 2) 사용법 2. 기본 데이터타입 사용법과 동일. byte, short, int, long ...
		// 힙 영역에 동일한 문자열이 존재하면, 재사용한다. 그래서 주소가 동일하게 된다.

		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // 주소 비교. "true"
		System.out.println(str3.equals(str4)); // 데이타 비교. true

		// String 클래스 메서드는 자바스크립트 String 객체 메서드와 동일하거나 유사하다.
	}
}
