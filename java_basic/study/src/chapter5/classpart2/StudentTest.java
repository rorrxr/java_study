package chapter5.classpart2;

public class StudentTest {

	public static void main(String[] args) {
		// 
		Student stu1 = new Student();
		
		// stu1 객체가 주소를 가지고 힙 영역의 studentName 필드에 해당하는 곳에 "홍길동 저장"
		stu1.studentName = "홍길동"; 
		stu1.studentID = 1; 
		stu1.grade = 1;
		stu1.address = "노원구";
		
		stu1.getStudentName();
		
		String name1 = stu1.getStudentName(); // 홍길동
		
		Student stu2; // 스택 영역에 메모리 생성이 된다. null. 참조하는 것이 없다.
		stu2 = new Student();
		
		stu2.studentID = 2;
		stu2.studentName = "이순신";
		stu2.grade = 3;
		stu2.address = "전라도";
		
		
		String name2 = stu2.getStudentName(); // 이순신
		
		System.out.println(name1);
		System.out.println(name2);
		
		// stu1 stu2 : 힙영역에 생성된 주소를 참조하는 값
		
		System.out.println("stu1 : " + stu1);
		System.out.println("stu2 : " + stu2);
		
		/*
			 Student stu1;
			 stu1 = new Student(); 
		 */
		
		// 메모리 사용
		// 3가지로 구분 : 스택영역, 힙영역, 메서드영역
		// Student stu1 : 스택영역에 4byte로 기억장소 생성됨. 그 안에 값은 null
		// stu1 = new Student();
		// new 메모리 생성 연산자 : Student 클래스의 내용(필드, 메서드) 등을 가지고 힙영역에 메모리 생성
		// 스택 영역 : 주소를 관리, 힙 영역 : 실제 데이터가 관리
		// Student() 생성자에서도 힙영역에 생성된 메모리를 초기화하는 작업
		
		// stu1에 힙영역에 생성된 기억장소의 주소가 대입된다.
		// 번외로, main() 메서드 안에 사용한 기온 데이터타입 8개는 스택 영역에 메모리 생성하고, 데이터가 관리된다.
		
		
	}
}