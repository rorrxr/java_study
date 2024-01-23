package Test;

import java.io.FileOutputStream;
import java.io.IOException;

/* 

학습한 내용을 적용하여 구구단 프로그램을 하여라. 파일명은 GuGuDan.java 
[수행조건]

 - 옆의 화면과 같이 실행이 되어야 한다.
 - gugudan.txt 텍스트파일에 구구단 내용을  저장한다. 그리고 구구단 파일 내용을 출력한다.
 
*/

public class GuGuDan {

	public static void main(String[] args) {
		
		try{
			FileOutputStream fos = new FileOutputStream("C:\\\\Dev\\\\workspace\\\\java_basic\\\\study\\\\src\\\\Test\\\\\\\\\\gugudan.txt");
			for(int i = 2; i <= 9; i++) {
					for(int j = 1; j <= 9; j++) {
						String str = i + " * " + j + " = " + (i * j) + "\t";
						fos.write(str.getBytes());
					}// 내부 for문 종료
					fos.write('\n');
				}// 외부 for문 종료
		}catch(IOException e){
			e.printStackTrace();
		}
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}// 내부 for문 종료
		
		
		//System.out.println("출력이 완료되었습니다");
	}
	
}
