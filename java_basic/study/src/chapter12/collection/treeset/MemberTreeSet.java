package chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;


public class MemberTreeSet {
	private TreeSet<Member> treeSet; // HashSet 선언

	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(); // Member형으로 선언한 HashSet 생성
	}
	
	public void addMember(Member member) {
		// add 메서드가 호출될 때 중복검사가 발생된다.
		// hashCode(), equals() 메서드가 동작되어, 결과값을 가지고 중복처리를 한다.
		treeSet.add(member); // HashSet에 회원을 추가하는 메서드
	}
	
	
	// 매개변수로 받은 회원아이디에 해당하는 회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator(); // Iterator를 활용해 순회함
		while(ir.hasNext()) { // 커서가 가리키는 위치에 데이터 존재 유무를 체크
			Member member = ir.next(); // 데이터를 읽어온다 // 회원을 하나씩 가져와서
			int tempId = member.getMemberId(); // 아이디 비교
			if(tempId == memberId) { // 같은 아이디인 경우
				treeSet.remove(member); // 해당 멤버를 삭제, 멤버를 객체로 삭제
				return true;
			}
		}
		
		// 반복문이 끝날 떄까지 아이디를 찾지 못한 경우 실행		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
