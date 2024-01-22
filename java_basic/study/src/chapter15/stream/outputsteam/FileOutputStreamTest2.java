package chapter15.stream.outputsteam;

import java.io.FileOutputStream;
import java.io.IOException;

// 출력 스트림 : 배열 사용하여 출력하기.
public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("C:\\\\\\\\\\\\\\\\Dev\\\\\\\\\\\\\\\\workspace\\\\\\\\\\\\\\\\java_basic\\\\\\\\\\\\\\\\study\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\chapter15\\\\\\\\\\\\\\\\stream\\\\\\\\\\\\\\\\outputsteam\\\\\\\\\\\\\\\\output2.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 65; // 'A' 아스키코드값
			
			// 배열에 알파벳 26개 문자 아스키코드값을 저장
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs); // 배열의 내용을 한번에 출력하기. output2.txt 작업 완료
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료됨");
	}

}
