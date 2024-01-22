package chapter15.stream.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		// Reader : 입력 문자 스트림. 최상위 추상 클래스
		// 텍스트 파일의 내용을 쉽게 읽고 쓰는 작업을 위하여 제공하는 클래스
		try(Reader fr = new FileReader("reader.txt")){
			int i;
			// 1개 문자를 읽어들인다.
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
