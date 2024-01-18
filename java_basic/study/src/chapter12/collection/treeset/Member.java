package chapter12.collection.treeset;

// Comparable
// 
public class Member implements Comparable<Member> {

	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름

	public Member(int memberId, String memberName){ //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {  //
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString(){   //toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}
	
	// 중복 검사 기준.
	// Member 클래스에 동일한 학번 데이터가 사용 시 중복검사 의하여, 저장되지 않는다.
	@Override
	public int hashCode() {
		System.out.println("중복 검사");
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if( obj instanceof Member){
			Member member = (Member)obj;
			if( this.memberId == member.memberId ) // 학번이 동일한 경우
				return true; // 동일하기 때문에 true로 반환
			else 
				return false; // 동일하지 않기 때문에 false로 반환
		}
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		
		return (this.memberId - member.memberId);   //오름차순
		//return (this.memberId - member.memberId) *  (-1);   //내림 차순
	}
	
}
