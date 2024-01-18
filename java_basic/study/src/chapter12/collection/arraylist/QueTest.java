package chapter12.collection.arraylist;

import java.util.LinkedList;
import java.util.Queue;

// Queue 인터페이스 : FIFO(First Input First Output)
public class QueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		//데이터 추가
		queue.add(1);
		queue.add(2);
		
		// peek() : 데이터 읽어오기. 제거는 안 함.
		System.out.println(queue.peek());
		
		queue.add(3);
		
		System.out.println(queue.peek());

		
		queue.add(4);
		
		System.out.println(queue.poll()); // 제거 후 반환
		System.out.println(queue.peek()); // 2
		System.out.println(queue.toString());
	}

}