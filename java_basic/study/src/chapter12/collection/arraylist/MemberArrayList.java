package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member; // collection 패키지에 있으므로 import 해야 한다.

// Collection 인터페이스 - List 인터페이스
// List 인터페이스 특징? 저장순서를 유지(인덱싱 방식). 값 중복 허용
// ArrayList : List 인터페이스를 구현
// 컬렉션 
public class MemberArrayList {
	private ArrayList<Member> arrayList; // ArrayList 선언

	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // Member형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) {
		arrayList.add(member); // ArrayList에 회원을 추가하는 메서드
	}
	
	
	// 멤버 id가 존재하면, 삭제
	// 해당 아이디를 가진 회원을 ArrayList에서 찾아 제거함
	public boolean removeMember(int memberId) {
		// 삭제 1 : for문 이용
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); // get 메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { // // 회원아이디가 매개 변수와 일치한다면
				arrayList.remove(i); // 해당 회원을 삭제, 멤버를 인덱스로 삭제
				return true;
			}
		}
		
		// 삭제 2 : Iterator 이용
		// Iterator(반복자)를 사용하여 데이터 읽기
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) { // 커서가 가리키는 위치에 데이터 존재 유무를 체크
			Member member = ir.next(); // 데이터를 읽어온다
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member); // 해당 멤버를 삭제, 멤버를 객체로 삭제
				return true;
			}
		}
		
		
		// 반복문이 끝날 떄까지 아이디를 찾지 못한 경우 실행		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
