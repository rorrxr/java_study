package chapter12.collection.map;

import java.util.HashMap;

// map 인터페이스를 구현한 HashMap 클래스
// 자료구조를 키(Key)와 값(Value)의 쌍구조로 관리
// 키는 중복 불가능 값은 중복 허용
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("1", "홍길동1");
		map.put("2", "홍길동2");
		map.put("3", "홍길동3");
		map.put("4", "홍길동4");
		
		map.put("5", "홍길동4"); // 값(value)은 중복이 된다.
		map.put("2", "홍길동6"); // 키(key)는 중복이 불가능하다. 따라서 이전의 값은 지워지고 새로운 값이 들어온다.
		
		System.out.println(map);
	}

}