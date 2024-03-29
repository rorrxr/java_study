package chapter5.classpart;

// 클래스 정의(설계)는 필드와 메서드로 구성할 수 있다.
// 클래스는 필드(변수)로 구성
// 클래스는 메서드로 구성
// 클래스는 필드와 메서드를 둘 다 구성
// 클래스는 데이터타입이다. 데이터타입 기능? 기억 장소를 형태와 크기로 생성
// 클래스를 사용할 때는 데이터타입처럼 사용하면 된다.

public class Student {
	
	// 학생 정보를 저장하기 위한 변수 	-> 필드(field)
	int studentID; // 학번
	String studentName; // 이름
	int grade; // 학년
	String address; // 사는 곳(주소지)
	
	
	// 위의 변수를 이용하여, 작업하는 기능.		메서드(method)
	// 자바스크립트의 함수 정의와 유사하다.
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름 주소 출력
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// 4개의 필드(studentID, studentName, grade, address)와
	// 3개의 메서드(showStudentInfo(), getStudentName(), setStudentName() 를 생성하였다.
	
	//Student 클래스 안에 main 메서드는 클래스의 구성 요소가 아니다. 상관이 없다.
	public static void main(String[] args) {
		// 클래스 사용하기
		// 변수 선언 방식 - 데이터타입 변수 이름;
		// 클래스 생성 방식 - 클래스자료형 클래수변수명 = new 클래스();
		// Student 클래스 자료형으로 stu1 변수를 선언하고 
		// new Student();로 Student 클래스를 생성하여 stu1에 대입한다는 뜻이다.
		Student stu1 = new Student(); // 기억 장소 생성
		Student stu2 = new Student(); // 기억 장소 생성

		stu1.studentID = 1;
		stu1.studentName = "홍길동";
		stu1.grade = 4;
		stu1.address = "노원구";

		System.out.println("학번은? " + stu1.studentID );
		System.out.println("이름은? " + stu1.studentName );
		System.out.println("학년은? " + stu1.grade );
		System.out.println("주소는? " + stu1.address );
		System.out.println();
		
		stu2.studentID = 2;
		stu2.studentName = "손흥민";
		stu2.grade = 3;
		stu2.address = "도봉구";

		System.out.println("학번은? " + stu2.studentID );
		System.out.println("이름은? " + stu2.studentName );
		System.out.println("학년은? " + stu2.grade );
		System.out.println("주소는? " + stu2.address );
		
	}
}
