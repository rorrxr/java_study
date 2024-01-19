package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		// List<String> sList = 구현 클래스;
		List<String> sList = new ArrayList<String>();
		sList.add("손흥민");
		sList.add("김민재");
		sList.add("이강인");
		
		// 일반 for문
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		System.out.println();
		
		// 향상된 for문
		for(String s : sList) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// 스트림
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s + " "));
		
		System.out.println();
		
		// 정렬
		sList.stream().sorted().forEach(s -> System.out.println(s + " "));
	}
}
