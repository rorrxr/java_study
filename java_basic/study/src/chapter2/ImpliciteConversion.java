package chapter2;

public class ImpliciteConversion {
	public static void main(String[] args) {
		// 형변환 (Casting) : 데이터타입 일치
		// 묵시적 형변환 예제
		// 묵시적 형변환 : 내부적으로 좌측 변수 데이터타입에 형으로 변환되어 값이 저장된다.
		// -> 내부적으로는 좌측 변수 데이터타입에 우측의 데이터값이 좌측의 변수 타입으로 변환되어 값이 저장된다.
		
		// 정수형 데이터타입보다는 실수형 데이터타입이 더 큰 개념이다.
		// byte < short or char < int < long < float < double
		
		// 큰 데이터타입 변수 = 작은 데이터타입의 값
		byte bNum = 10;
		int iNum = bNum; // int = byte;		int iNum = (int)pNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // float = int;		float fNum = (float) iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		// 다른 데이터타입끼리 연산을 하면, 큰 데이터타입으로 형변환이 발생된다.
		double dNum;
		dNum = fNum + iNum; // dNum = fNum + (float)iNum -> dNum = (double)(fNum + (float) iNum);
		System.out.println(dNum);
	}
}
