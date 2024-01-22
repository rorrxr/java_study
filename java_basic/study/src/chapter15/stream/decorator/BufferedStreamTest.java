package chapter15.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		long milisecond = 0;
		try (
			//메인 스트림 객체생성
			FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			
			// 보조 스트림 객체생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			)//try 조건
		{
			milisecond = System.currentTimeMillis(); // 파일 복사를 시작하기 전 시간
			int i;
			while ( (i = bis.read()) != -1) {
				bos.write(i);
			}//while문 종료
			// 버퍼스트림에 이용하여 작업 완료 후 종료
			milisecond = System.currentTimeMillis() - milisecond; // 파일을 복사하는 데 걸리는 시간 계산
 		}//try문 종료
		catch (IOException e){
			e.printStackTrace();
		}
	}
}

