package Test;

/*

 - 회원(Member)클래스는 회원 아이디(userId) 문자열, 회원이름(name) 문자열, 회원나이(age) 정수 필드를 가지고 있다. 
 각 필드에 대한 setter, getter 메소드를 정의

 Object 클래스의 toString()메서드 재정의 : 회원정보 내용.
- 이름: 홍길동 아이디: user01 나이: 100 매개변수값을 갖는 생성자 정의.

- MemberTest.java 클래스를 생성하고, main메서드에서 obj 객체생성 및 객체 출력
 */

class Member{
	String userId; // 회원 아이디(문자열) 변수 선언
	String name; // 회원 이름(문자열) 변수 선언
	int age; // 회원 나이(정수) 변수 선언
	
	public Member(String name, String userId, int age) {
		this.name = name;
		this.userId = userId;
		this.age = age;
	}
	
	
	// 회원 아이디 setter 메서드
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	// 회원 아이디 getter 메서드
	public String getUserId() {
		return userId;
	}
	
	// 회원 이름 setter 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	// 회원 이름 getter 메서드
	public String getName() {
		return name;
	}
	
	// 회원 나이 setter 메서드
	public void setAge(int age) {
		this.age = age;
	}
	
	// 회원 나이 getter 메서드
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + " 아이디 : " +  userId + " 나이 : " + age;
	}
}

public class MemberTest {
	public static void main(String[] args) {
		Member obj = new Member("홍길동", "user01", 100);
		
		System.out.println(obj);
	}
}
