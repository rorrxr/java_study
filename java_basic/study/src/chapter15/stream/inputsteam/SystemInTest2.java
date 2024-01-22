package chapter15.stream.inputsteam;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 입력하고, [enter]를 누르세요.");
		
		
		// \n : 줄바꿈 기능.  Escape Sequence
		// System.in.read() : 키 하나를 입력받아 키값을 읽어들인다.
		int i;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
