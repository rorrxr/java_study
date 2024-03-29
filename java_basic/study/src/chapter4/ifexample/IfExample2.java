package chapter4.ifexample;

public class IfExample2 {
	public static void main(String[] args) {
		// 제어문 : 다중 if문
		// 디버깅 : 프로그램의 오류를 찾는 작업
		
		// 단축키
		// F5 : 한줄씩 진행되면 함수 안이면 함수 안으로 들어갑니다.
		// F6 : 한줄씩 진행하되 함수 호출은 건너뜁니다.
		// F7 : 현재 함수 끝까지 바로 가서 함수 호출부로 되돌아갑니다.
		// F8 : 다음 브레이크 포인트까지 건너뜁니다.
		
		// 라인 좌측에 표시되는 동그라미 : 중단점(Break Point)
		// 중단점 라인에서 코드가 실행되지 않고 일시정지가 된다.
		
		int age = 9; 
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("중학생입니다");
		}else {
			charge = 3000;
			System.out.println("일반인입니다");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}
