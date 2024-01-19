package chapter14.exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoCloseObj obj = new AutoCloseObj();
		
		// obj.close();
		// AutoCloseable 인터페이스를 구현한 클래스 사용
		try(AutoCloseObj obj2 = obj) { // try(객체 생성 구문)
			throw new Exception(); // 실행 시 예외가 발생된 효과
		}catch(Exception e){
			System.out.println("예외 부분입니다.");
		}
	}

}
