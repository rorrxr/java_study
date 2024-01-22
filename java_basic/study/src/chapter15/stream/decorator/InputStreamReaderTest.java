package chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 보조 스트림 : 메인 스트림에 추가하여 작업하는 특징을 갖고 있다.
// 데코레이터 디자인 패턴 특징
public class InputStreamReaderTest {
	public static void main(String[] args) {
		// 메인 스트림(1차 스트림)
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){

			// 보조 스트림(2차 스트림)
			//InputStreamReader isr = new InputStreamReader(fis);
			int i;
			while((i = isr.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
