package chapter15.stream.inputsteam;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		// 데이터 소스 : 파일
		
		FileInputStream fis = null;
		
		try {
			// input.txt 파일이 존재하지 않으면 예외 발생
			//fis = new FileInputStream("C:\\Dev\\workspace\\java_basic\\study\\src\\chapter15\\stream\\inputsteam\\input.txt");
			fis = new FileInputStream("input.txt");
			
			// fis 입력 스트림을 통하여, 파일 데이터 읽기 작업.
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());

		} catch (IOException e) { // 예외 관련 클래스. try 구문에서 발생한 예외정보를 처리하는 클래스
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			} //try catch문 종료
		} //finally문 종료
		System.out.println("프로그램 종료");
		
	}

}
