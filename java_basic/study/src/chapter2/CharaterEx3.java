package chapter2;

public class CharaterEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// char 데이터타입 값 범위 0 ~ 65535
		
		int a = 65;
		int b = -66;
		
		char a2 = 65; // 문자로 사용한다.
		// char b2 = -66; //값의 범위 이내에 해당하지 않아 에러가 발생한다. //문자형 변수에 음수를 넣으면 오류가 발생한다.
		
		// 데이터타입 변환 또는 형변환 또는 Casting
		// (데이터타입) 변수
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
	}

}
