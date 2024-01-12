package chapter5.classpart2;

// 학생 정보를 관리하는 클래스
public class Student {
	
	// 필드 (or 멤버변수)
	
	// 학번
	int studentID;
	// 이름
	String studentName;
	// 학년
	int grade;
	// 주소
	String address;
	
	// 학생 이름을 리턴하는 메서드
	public String getStudentName() {
		return studentName;
	}
}
