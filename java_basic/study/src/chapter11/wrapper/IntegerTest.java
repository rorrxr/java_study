package chapter11.wrapper;

// Wrapper 클래스 : 기본 데이터타입을 위한 클래스
// 기본데이터 타입을 객체로 사용하는 목적.
public class IntegerTest {

	public static void main(String[] args) {
		// 기본 데이터타입 : boolean, byte, char, short, int, long, float, double
		
		// Wrapper 클래스의 종류
		/*
			Boolean;
			Byte;
			Character;
			Short;
			Integer;
			Long;
			Float;
			Double;
		*/
		
		Integer num = 100; // Boxing 형변환. 스택 영역의 값 -> 힙 영역의 기억장소를 생성
		int iNum = num.intValue();
		int jNum = 200;
		
		int sum = num + jNum;
		System.out.println(sum);
		
		int total = num + jNum;
		System.out.println(total);
		
		Integer i = jNum; // UnBoxing 형변환. 힙 영역의 값을 스택 영역의 기억장소를 생성
		System.out.println(i);
		
		String str = "1000";
		//문자열 데이터 "1000"을 숫자 1000으로 변환하여 사용.
		int number = Integer.parseInt(str);
		
		String str2 = "true";
		//문자열 데이터 "1000"을 boolean(논리형) true로 변환하여 사용.
		boolean b = Boolean.parseBoolean(str2);
		
		
	}

}
