package chapter14.exception;

// 사용자정의 예외 클래스 만들기
// 회사의 업무 기능 구현
public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		// 아이디에 대한 제약 조건 구현
		// IDFormatException 예외를 setUserID() 메서드가 호출될 때 처리하도록 미룸
		if(userID == null) {
			// 사용자정의 예외 클래스
			throw new IDFormatException("아이디는 null일 수 없습니다."); // 강제로 예외 발생시킴
		}else if(userID.length() < 8 || userID.length() > 20) {
			// 사용자정의 예외 클래스
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용가능"); // 강제로 예외 발생시킴
		}
		this.userID = userID;
	}
	
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		// 아이디 값이 null인 경우
		String userID = null;
		try {
			test.setUserID(userID);
		}catch(IDFormatException e){
			System.out.println(e.getMessage());
		}
		
		// 아이디 값이 8자 이하인 경우
		userID = "1234567";
		try {
			test.setUserID(userID);
		}catch(IDFormatException e){
			System.out.println(e.getMessage());
		}
	}

}
