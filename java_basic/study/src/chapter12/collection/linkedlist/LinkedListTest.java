package chapter12.collection.linkedlist;

import java.util.LinkedList;

// List 인터페이스를 구현한 LinkedList 클래스
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();

		myList.add("A"); // 인덱스 0
		myList.add("B"); // 인덱스 1
		myList.add("C"); // 인덱스 2
		
		System.out.println(myList); // [A, B, C]
		
		myList.add(1, "D"); // 인덱스 1에 데이터 삽입
		System.out.println(myList); // [A, D, B, C]
		System.out.println(myList.removeLast()); // C
		
		System.out.println(myList); // [A, D, B]
		
	}

}
