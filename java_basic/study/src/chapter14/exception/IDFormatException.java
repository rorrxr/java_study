package chapter14.exception;

// 사용자정의 예외 클래스
public class IDFormatException extends Exception{
	

	// 생성자의 매개변수로 예외 상황 메시지를 받음
	public IDFormatException(String message) { 
		super(message);
	}
	
}
