package chapter5.package2;

import chapter5.package1.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate(); //객체 생성 구문
		
		// 패키지가 서로 다른 경우에는 default 필드가 private으로 반응하여, 접근 불가능
		// 접근 에러 발생
		/*
		date.month = 2;
		date.day = 31;
		date.year = 2024;
		*/
	}

}