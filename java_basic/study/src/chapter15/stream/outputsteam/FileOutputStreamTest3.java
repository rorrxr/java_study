package chapter15.stream.outputsteam;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("C:\\\\\\\\\\\\\\\\Dev\\\\\\\\\\\\\\\\workspace\\\\\\\\\\\\\\\\java_basic\\\\\\\\\\\\\\\\study\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\chapter15\\\\\\\\\\\\\\\\stream\\\\\\\\\\\\\\\\outputsteam\\\\\\\\\\\\\\\\output3.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 65; // 'A' 아스키코드값
			
			// 배열에 알파벳 26개 문자 아스키코드값을 저장
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			// 파일에 출력작업. 버퍼가 내부적으로 사용함.
			// write() 출력 스트림의 버퍼에 내용을 채우는 작업. 버퍼가 차면, 파일에 쓰기 작업이 진행된다.
			// flush() 버퍼에 내용에 차지 않아도, 버퍼의 내용을 파일에 쓴다. 버퍼 상태는 내용이 비워진다.
			// close() : 내부적으로 flush() 메서드를 호출
			fos.write(bs, 2, 10); // ABC~~~Z
			fos.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료");
	}

}
