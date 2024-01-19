package chapter14.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 작업을 하고, 예외 발생여부와 상관없이 반드시 실행해야 하는 코드작업을 finally 블럭에 해야함.
		FileInputStream fis = null;
				
		try {
			fis = new FileInputStream("a.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}finally { // 선택적으로 안 쓸 수도, 쓸 수도 있다.
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}//try~ catch문 종료
			}//if문 종료
			System.out.println("예외 여부와 상관없이 항상 수행합니다.");
		}//finally문 종료
	}
}
