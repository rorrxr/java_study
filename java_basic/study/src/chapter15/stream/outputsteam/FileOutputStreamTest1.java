package chapter15.stream.outputsteam;

import java.io.FileOutputStream;
import java.io.IOException;

// 클릭 스트림
public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		// FileOutputStream("파일명", true)를 하면 텍스트파일에 write를 입력한다
		try(FileOutputStream fos = new FileOutputStream("C:\\\\\\\\Dev\\\\\\\\workspace\\\\\\\\java_basic\\\\\\\\study\\\\\\\\src\\\\\\\\chapter15\\\\\\\\stream\\\\\\\\outputsteam\\\\\\\\output.txt", true)) {
			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C
			
		}catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}

}
