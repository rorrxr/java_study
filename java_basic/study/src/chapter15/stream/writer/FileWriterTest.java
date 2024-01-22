package chapter15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 문자 단위 스트림 : 출력 스트림
// 텍스트 파일의 내용을 읽고, 쓰는 작업은 문자 단위 스트림 클래스를 사용 권장.
public class FileWriterTest {
	public static void main(String[] args) {
		// 객체가 생성이 되면, 파일이 생성된다.
		try(Writer fw = new FileWriter("writer.txt")){
			// 1개의 문자
			fw.write('A');

			// 배열로 출력
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);
			
			// 문자열로 출력
			fw.write("안녕하세요. 자바 문법이 끝나가고 있습니다.");
			
			fw.write(buf, 1, 2);
			fw.write("65");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료");
	}
}
