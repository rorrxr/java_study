package chapter5.classpart;

public class StudentVariable {
	public static void main(String[] args) {
		// 학생 정보를 저장하기 위한 변수
		int studentID; // 학번
		String studentName; // 이름
		int grade; // 학년
		String address; // 사는 곳(주소지)
		
		studentID = 1;
		studentName = "홍길동";
		grade = 4;
		address = "노원구";
		
		System.out.println("학번은? " + studentID);
		System.out.println("이름은? " + studentName);
		System.out.println("학년? " + grade);
		System.out.println("주소는? " + address);
	}
}
