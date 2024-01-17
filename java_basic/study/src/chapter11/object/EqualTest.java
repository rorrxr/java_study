package chapter11.object;

import chapter6.singleton.Person;

class Student {
	int studentId;
	String studentName;
	
	//생성자
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// toString() 메서드
	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(studentId, studentName);
//	}
	
	
	// 2개의 객체가 동일한 데이터를 가지고 있으면, equals(), hashCode()메서드를 재정의하여
	// 동일한 데이터로 비교가 되도록 재정의를 한다.
	
	// 객체가 동일한 지를 비교하면
	// hashCode가 리턴하는 정수값이 같은지를 확인하고, 그 다음 equals 메서드가 true로 리턴하는지 확인하여
	// 동등 객체인지 판단한다.
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()메서드");

		if(obj instanceof Student) {
			Student std = (Student) obj;
//			if(studentId == std.studentId)
			if(studentId == std.studentId && studentName.equals(std))
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode()메서드");
		
		return studentId;
	}	
}

// 객체 비교시 내부적으로 Object 클래스의 equal(), hashCode()메서드가 사용된다
// st1, st2 객체와 st3 객체가 동일한 데이터를 가지고 있으면, 동일한 객체 비교가 되도록 equals(), hashCode() 메서드를 재정의해야 한다.
public class EqualTest {
	public static void main(String[] args) {
		Student st1 = new Student(100, "손흥민");
		Student st2 = st1; // 힙 영역의 주소대입
		Student st3 = new Student(100, "손흥민");
		
		// 동일한 주소의 두 인스턴스 비교
		// == 주소로 비교.
		if(st1 == st2) {
			System.out.println("st1과 st2 주소가 같습니다.");
		}else {
			System.out.println("st1과 st2 주소가 같지 않습니다.");
		}
		
		// equals() 비교 가능 메서드
		if(st1.equals(st2)) {
			System.out.println("st1과 st2는 동일하다.");
		}else {
			System.out.println("st1과 st2는 동일하지 않다.");
		}
		
		if(st1 == st3) {
			System.out.println("st1과 st3 주소가 같습니다.");
		}else {
			System.out.println("st1과 st3 주소가 같지 않습니다.");
		}
		
		// 위에서 정의한 equals() 메서드를 주석처리 하게 된다면 "동일하지 않다"로 처리됨
		if(st1.equals(st3)) {
			System.out.println("st1과 st3는 동일하다.");
		}else {
			System.out.println("st1과 st3는 동일하지 않다.");
		}
		
		Person ps = new Person();
		//chapter6.singleton.Person@43a25848
		//				패키지명.클래스명@해시코드값
		// 해시코드값 : 힙 영역의 주소를 찾아가는 용도로 사용됨.
		System.out.println(ps);
		System.out.println(ps.toString()); //chapter6.singleton.Person@43a25848
		System.out.println(ps.hashCode()); //chapter6.singleton.Person@43a25848
	}
}
