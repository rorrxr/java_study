package chapter12.collection.treeset;

import java.util.TreeSet;

// set 인터페이스를 구현한 클래스 : HashSet 클래스
// 저장 순서를 관리 안 한다. 데이터값이 중복 허용을 안 한다.
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(new String("홍길동1"));
		treeSet.add(new String("홍길동2"));
		treeSet.add(new String("홍길동3"));
		
		
		
		System.out.println(treeSet); // 홍길동4 홍길동5 홍길동2 홍길동3 홍길동1
	}

}
