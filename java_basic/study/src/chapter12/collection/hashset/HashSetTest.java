package chapter12.collection.hashset;

import java.util.HashSet;

// set 인터페이스를 구현한 클래스 : HashSet 클래스
// 저장 순서를 관리 안 한다. 데이터값이 중복 허용을 안 한다.
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("홍길동1"));
		hashSet.add(new String("홍길동2"));
		hashSet.add(new String("홍길동3"));
		hashSet.add(new String("홍길동4"));
		hashSet.add(new String("홍길동5"));
		
		// 단순 데이터들은 중복검사를 HashSet 클래스가 지원된다.
		// 클래스를 생성하여 만든 객체들은 중복검사 기준이 없어서 중복 허용이 될 수밖에 없다.
		hashSet.add(new String("홍길동1")); //동일한 내용이 있기 때문에 중복을 허용하지 않기 때문에 나오지 않는다.
		
		
		System.out.println(hashSet); // 홍길동4 홍길동5 홍길동2 홍길동3 홍길동1
	}

}
