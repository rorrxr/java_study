package Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class test {
	public static void main(String[] args) throws IOException {
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
		
		Reader fr = new FileReader("gugudan.txt");
		int i; 
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
		}
		
		fr.close();
	}
}
