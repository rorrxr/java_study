package chapter7.array;

/*
자바
# 데이터타입 : 기억장소를 생성하는 기능.

1) 기본 원시타입(primitive type) : 스택(Stack)영역만 사용
- 8개
정수형 : byte, short, char, int, long
실수형 : float, double
논리형 : boolean

사용방법 : int a; float f;

2) 참조타입 : 스택(Stack)영역과 힙(Heap)영역 2가지를 사용
- 클래스, 배열, 열거형, 인터페이스

클래스 사용법
Person ps = new Person();
Calender cal = Calender.getInstance(); //내부적으로는 new Calender()

#배열

1) 기본원시타입 배열 (값 타입 배열)

2) 참조타입 배열(클래스 배열, 객체 배열)
*/

// 배열 : 동일한 데이터타입으로 구성된 연속적인 기억장소를 하나로 관리
// 배열은 참조타입이며, 객체이다. (암기)
public class ArrayTest {

	public static void main(String[] args) {
		// 기본 데이터타입으로 만든 배열 : 값타입 배열
		// int[] 배열 이름 = new 값타입[] {배열 데이터};
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		// 배열의 장점 : for문을 사용할 수 있다.
		// 배열 데이터가 많아져도 for문의 length는 바뀌지 않아서 소스 코드를 건들지 않아도 된다.
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		
	}

}
