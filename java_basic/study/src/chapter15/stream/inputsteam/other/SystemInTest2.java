package chapter15.stream.inputsteam.other;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러 개를 쓰고 [enter]를 누르세요.");
		
		// \n : 줄바꿈 기능. Escape Sequence
		// System.in.read() : 키 하나를 입력받아 키값을 읽어들인다.
		int i;
		
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
