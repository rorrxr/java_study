package chapter13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// 인터페이스를 구현한 클래스
// BinaryOperator를 구현한 클래스 정의
class CompareString implements BinaryOperator<String>{
	@Override
	public String apply(String s1, String s2) {
		
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
		
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~", "hello", "Good Morning", "반갑습니다."};
		// reduce("", BinaryOperator);
		// 1) 람다식으로 직접 구현. (일회성)
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
														if(s1.getBytes().length >= s2.getBytes().length) return s1;
														else return s2;
													}));
		
		// reduce(BinaryOperator 객체);
		// 2) BinaryOperator 인터페이스를 구현한 CompareString 클래스 사용
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
