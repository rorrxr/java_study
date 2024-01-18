package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	//추가
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	// 삭제
	public String deQueue( ) {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비웠습니다.");
			return null;
		}
		return (arrayQueue.remove(0));
	}
}

// ArrayList로 Queue 구현하기
public class QueueTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}

}