package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		// char 데이터 타입(2Byte) : 문자 1개를 저장하는 기억 장소 생성.
		
		// 1개의 문자를 표현 시 반드시 '' 작은 따옴표를 감싸야 한다.
		// 실제 기억장소에는 코드(ascii code, uni-code)값으로 저장된다.
		
		char ch1 = '한'; // 두글자 쓰게 된다면 오류가 발생한다.
		char ch2 = '\ud55C'; // \\u 유니코드 D55C 16진수값, 백슬래시는 키보드 원화와 같다.

		System.out.println(ch1);
		System.out.println(ch2);
		
	}

}
