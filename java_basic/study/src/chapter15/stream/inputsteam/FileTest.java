package chapter15.stream.inputsteam;

import java.io.File;
import java.io.IOException;

// 제공하는 클래스 : File 클래스
public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Dev\\workspace\\java_basic\\study\\src\\chapter15\\stream\\other\\newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile()); // true file 객체가 참조하는 대상이 파일인지 체크
		System.out.println(file.isDirectory()); // false file 객체가 참조하는 대상이 폴더인지 체크
		
		System.out.println(file.getName()); //newFile.txt
		System.out.println(file.getAbsolutePath()); // C:\Dev\workspace\java_basic\study\src\chapter
		System.out.println(file.getPath()); // C:\Dev\workspace\java_basic\study\src\chapter15\
		System.out.println(file.canRead()); // true
		System.out.println(file.canWrite()); //true
		
		file.delete(); // 파일 삭제
		
		File dir = new File("C:\\Dev\\workspace\\java_basic\\study\\src\\chapter15\\stream\\other\\newFile.txt");
		// 경로에 존재하지 않는 폴더는 모두 생성한다.
		dir.mkdir(); // dir.mkdir (): 현재 폴더를 기준하여, 자식 폴더 생성
		
		
	}

}
