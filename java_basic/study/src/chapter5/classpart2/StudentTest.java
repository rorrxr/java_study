package chapter5.classpart2;

public class StudentTest {

	public static void main(String[] args) {
		// 
		Student st1 = new Student();
		
		// stu1 객체가 주소를 가지고 힙 영역의 studentName 필드에 해당하는 곳에 "홍길동 저장"
		st1.studentName = "홍길동"; 
		
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
		
		st1.studentID = 1; 
		st1.grade = 3;
		st1.address = "노원구";
		
		st1.getStudentName();
	}
}
