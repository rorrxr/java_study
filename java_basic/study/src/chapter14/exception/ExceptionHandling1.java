package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 컴파일러에 의해 예외가 처리되는 경우
// 메서드가 예외가 발생할 수 있으니, 예외 관련 작업을 처리를 해야 한다. 문법 규칙

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		}catch(FileNotFoundException e) {
			// catch block
			//e.printStackTrace(); // 예외정보를 출력
			//System.out.println(e);
		}
		
		System.out.println("프로그램 종료");
	}

}
