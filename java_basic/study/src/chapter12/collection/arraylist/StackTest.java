package chapter12.collection.arraylist;

import java.util.Stack;

// List 인터페이스 구현 : Stack 클래스
// 자료구조 특징? LIFO(Last Input First Output)
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();

		// 데이터 추가
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		
		int size = stack.size();
		
		for(int i = 0; i < size; i++) {
			System.out.println(stack.pop()); //데이터 꺼내오기
		}
		
	}

}