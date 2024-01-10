package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		// 데이터타입 없이 변수 선언하기. java 10
		
		var num = 10; // int i = 10으로 컴파일 된다.
		var j = 10.0; //double j = 10.0으로 컴파일 된다. TypeInference.class 파일 생성
		var str = "hello"; // String str = "hello"로 컴파일 된다.
		
		System.out.println(num);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른 문자열은 대입이 가능하다.
		// str = 3;  // str 변수는 String 형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없다.
	}

}
