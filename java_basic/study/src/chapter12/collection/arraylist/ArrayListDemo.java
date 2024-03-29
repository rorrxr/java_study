package chapter12.collection.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member;

// ArrayList 클래스 사용법
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Member> a1 = new ArrayList<Member>();
		
		// 데이터 추가. add()
		
		a1.add(new Member(1, "손흥민")); // 인덱스 0
		a1.add(new Member(2, "김민재")); // 인덱스 1
		a1.add(new Member(3, "황희찬")); // 인덱스 2
		a1.add(new Member(4, "이강인")); // 인덱스 3
		
		// 읽기. get(인덱스) 
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("===========================");
		
		// 제거. remover(인덱스)
		a1.remove(2);
		
		// 모든 데이터 읽기. get(인덱스)
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("===========================");

		Member memberSon = a1.get(0);
		System.out.println(memberSon); //memberSon.toString() 호출
		
	}

}
