package chapter2;

public class ExpilicitConversion {
	public static void main(String[] args) {
		// 명시적 형변환 예제
		// 좌측의 데이터타입이 우측의 데이터 값보다 클 경우 명시적 형변환 작업을 해야 한다.
		// 형변환 작업시 값이 다르게 나오는 것을 주의해야 한다.
		
		// 변수 = (데이터타입) 변수 타입 일치가 되게 한다.
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		// int iNum3 = dNum1 + fNum2; int = double + float 데이터타입이 달라서 오류 발생
		int iNum3 = (int)dNum1 + (int)fNum2; // 데이터타입을 정수형으로 변환해서 오류 x
		int iNum4 = (int)(dNum1 + fNum2); // int iNum3 = (int)dNum1 + (int)fNum2 과 같다.

		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
