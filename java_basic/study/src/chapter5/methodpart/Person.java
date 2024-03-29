package chapter5.methodpart;

public class Person {
	// 개인정보를 관리하는 클래스
	
	// 필드 선언
	String name; // 이름
	int height; // 신장(키)
	double weight; // 몸무게
	char gender; // 성별
	boolean married; // 결혼 유무
	
	// 메서드 : 자바스크립트의 함수와 유사
	// 유형 : 4개
	// 기본 문법
	/*
	 	접근자 리턴타입 메서드명 (매개변수, ...){
	 	
	 	}
	 	
	 	접근자 : public 

	 */
	
	// 1) 매개변수가 없고, 리턴값이 없는 메소드
	public void print_name() { // name을 출력하는 메서드
		System.out.println("이름은? " + name);
	}
	
	// 2) 매개변수가 없고, 리턴값이 있는 메서드
	public String getName() {
		return name;
	}
	
	// 3) 매개변수가 있고, 리턴값이 없는 메소드
	public void setWeight(double w){
		weight = w;
	}
	
	// 4) 매개변수가 있고, 리턴값이 있는 메서드 (몸무게가 100 이상이면 true, 아니면 false)
	public boolean isWeight(double w){
		
		if(w >= 100) {
			return true;
		}else {
			return false;
		}
	}
	
}