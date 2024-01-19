package chapter13.lambda;

// 인터페이스 구현 클래스 : 다른 외부에서도 사용 가능
public class StringConCatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println( s1 + "," + s2 );
	}
}