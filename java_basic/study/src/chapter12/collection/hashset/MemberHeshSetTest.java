package chapter12.collection.hashset;

// 순서가 없다. 중복 허용 불가능.
public class MemberHeshSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();

		Member mem1 = new Member(1001, "홍길동1");
		Member mem2 = new Member(1002, "홍길동2");
		Member mem3 = new Member(1003, "홍길동3");
		Member mem4 = new Member(1004, "홍길동4");

		memberHashSet.addMember(mem1);
		memberHashSet.addMember(mem2);
		memberHashSet.addMember(mem3);
		memberHashSet.addMember(mem4);
		
		memberHashSet.showAllMember();
		
		System.out.println("========= 동일한 아이디 추가 후 ==============");
		
		Member mem5 = new Member(1003, "홍길동5"); // 아이디 중복회원 추가
		memberHashSet.addMember(mem5);
		
		memberHashSet.showAllMember();
		
		// 객체 정렬 확인 구문
	}

}
