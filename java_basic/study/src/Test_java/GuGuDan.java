package Test_java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class GuGuDan {
	public static void main(String[] args) throws IOException {
		// 출력 스트림 생성
		Writer fw = new FileWriter("gugudan.txt");
		
		// 곱
		for(int i = 1; i <= 9; i++) {
			//단
			for(int j = 2; j <= 9; j++) {
				fw.write(j + "*" + i + "=" + (j*i) + '\t');
			}
			fw.write("\n");
		}
		
		fw.close();
		
		// 입력 스트림 생성
		Reader fr = new FileReader("gugudan.txt");
		int i; 
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
		}
		
		fr.close();
	}
}
