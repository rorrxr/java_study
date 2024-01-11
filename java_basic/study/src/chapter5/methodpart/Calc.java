package chapter5.methodpart;

// 계산 기능 클래스
public class Calc {
	int num1;
	int num2;
	
	// 메서드 명 : printAdd, 리턴값이 없고, 두 변수값을 더해서 출력하는 예제
	public void printAdd() {
		System.out.println(num1 + num2); 
	}
	
	// 메서드명 : getAdd, 리턴값이 있고, 두 변수값을 더해서 값을 리턴
	public int getAdd() {
		return num1 + num2;
		
	}
	
	// 메서드명 : getNum, 리턴값이 있고 리턴값은 num1 변수의 값을 리턴
	public int getNum() {
		return num1;
	}
	
	// 메서드명 : setNum, 리턴값은 없고, 매개변수 n1, n1을 num1 변수에 값을 저장
	public void setNum(int n1) {
		num1 = n1;
	}
	
}
