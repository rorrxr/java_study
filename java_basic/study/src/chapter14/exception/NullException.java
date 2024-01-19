package chapter14.exception;

public class NullException {

	public static void main(String[] args) {
		String str = null;
		try {
			// 예외가 발생할 수 있는 코드
			System.out.println(str.toString());
		}catch(Exception e) {
			
		}
	}

}
