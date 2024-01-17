package chapter11.string;

// String 클래스는 문자열 연결 작업시 새로운 메모리가 생성이 된다.
public class StringTest2 {

	public static void main(String[] args) {
		String str = "안녕하세요.";
		
		str += "반갑습니다."; // str = str + "반갑습니다.";
		
		System.out.println("처음 주소 : " + System.identityHashCode(str));
		
		// str = str + "반갑습니다."; --> "안녕하세요.반갑습니다.";
		System.out.println(str);
		
		System.out.println("연결된 문자열 주소 : " + System.identityHashCode(str));

	}

}
