package chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		
		// 실수형 데이터타입 - 정수형 데이터타입 표현 방식을 사용하지 않고, 부동 소수점 표현 방식으로 실수값을 표현한다.
		// float(4byte), double(8byte)
		
		// 실수형은 double이 기본을 인식한다.
		// 실수값을 사용하면 double 데이터타입으로 처리한다.
		
		double dnum = 3.14;
		//double ddnum = 3.14f; // 8byte <= 4byte 가능 

		//float fnum = 3.14; // 4byte <= 8byte 불가능
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
	}

}
