package chapter6.staticex;

public class Student1 {
	
	// 필드 선언 (멤버 변수)
	// [접근자] [static] 데이터타입 변수이름;
	
	// 정적 필드(static) or non-instance 필드 : 메모리가 static area method area
	// 객체 생성보다 먼저 기억장소가 생성이 된다.
	static int serialNum;
	
	// 인스턴스(instance) 필드 : 메모리가 힙 영역에 생성된다.
 	
	int studentId;
	String studentName;
	int grade;
	String address;

	// studentName 필드에 값을 읽어오는 메서드 : Getter
	public String getStudentName() {
		return studentName;
	}

	// studentName 필드에 값을 저장하는 메서드 : Setter
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// static serialNum 필드에 값을 읽어오는 메서드 : Getter
	public static int getSerialNum() {
		int i = 10;
		// static 메서드 안에서 객체 생성이 될지 안 될지 알 수가 없으므로
		// 인스턴스 메서드 또는 필드를 사용하지 못하도록 문법으로 설계를 해두었다.
		// studentName = "홍길동";
		return serialNum;
	}
	
	// static serialNum 필드에 값을 설정하는 메서드 : Setter
	public static void setSerialNum(int serialNum) {
		// static serialNum 필드는 this.serialNum를 사용할 수 없음, this는 클래스 인스턴스를 가르키는 것이기 때문이다.
		// static 필드는 [클래스명].[static 필드]을 사용한다.
		Student1.serialNum = serialNum;
	}
}
