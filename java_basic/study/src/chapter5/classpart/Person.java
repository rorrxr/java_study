package chapter5.classpart;

public class Person {
	// 개인정보를 관리하는 클래스
	
	// 필드 선언
	String name; // 이름
	int height; // 신장(키)
	double weight; // 몸무게
	char gender; // 성별
	boolean married; // 결혼 유무
	
	public void getPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("신장(키) : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + gender);
		System.out.println("결혼유무 : " + married);
	}
	
}