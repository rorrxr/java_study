package chapter11.string;

// String 클래스를 사용 시 성능을 목적으로 개선하기 위한 클래스 StringBuilder
public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("Java");
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		
		String str = buffer.toString();
		System.out.println(str);
		
	}

}
