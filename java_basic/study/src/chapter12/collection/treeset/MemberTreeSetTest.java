package chapter12.collection.treeset;

// 순서가 없다. 중복 허용 불가능.
public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member mem1 = new Member(1001, "홍길동1");
		Member mem2 = new Member(1002, "홍길동2");
		Member mem3 = new Member(1003, "홍길동3");
		Member mem4 = new Member(1004, "홍길동4");

		memberTreeSet.addMember(mem1);
		memberTreeSet.addMember(mem2);
		memberTreeSet.addMember(mem3);
		memberTreeSet.addMember(mem4);
		
		memberTreeSet.showAllMember();
		
		System.out.println("========= 동일한 아이디 추가 후 ==============");
		
		Member mem5 = new Member(1003, "홍길동5"); // 아이디 중복회원 추가
		memberTreeSet.addMember(mem5);
		
		memberTreeSet.showAllMember();
		
		// 객체 정렬 확인 구문
	}

}
