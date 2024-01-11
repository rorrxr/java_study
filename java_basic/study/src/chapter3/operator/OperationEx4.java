package chapter3.operator;

public class OperationEx4 {

	public static void main(String[] args) {
		// 조건 연산자 (삼항 연산자)
		// if ~ else 구문과 유사한 특징.
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		// 앞의 조건식이 True이면, ch 변수에 "T" 대입, False이면 ch 변수에 "F" 대입;
		ch = (fatherAge > motherAge) ? 'T' : 'F'; // false, ch = F
		
		System.out.println(ch);
	}
}
