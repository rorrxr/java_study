package chapter5.hiding;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		stu1.address = "노원구";
		stu1.grade = 1;
		stu1.studentID = 1;
		
		// stu1.studentName = "이순신";
		// stu1.studentName은 student.java에서 접근자가 private으로 설정되어서 보호하기 떄문에 나오지 않는다.
		
		stu1.setStudentName("이순신");
		stu1.getStudentName();
		
		//stu1.age = 20000000;
		
		
	}

}
