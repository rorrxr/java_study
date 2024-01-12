package chapter5.constructor;

public class Student {
	int studentID;
	String name;
	int age;
	String address;
	
	//기본 생성자
	public Student() {
		
	}
	
	//생성자1) 홍길동
	public Student(String pname) {
		name = pname;
	}
	
	//생성자2) 홍길동, 노원구
	public Student(String pname, String paddress) {
		name = pname;
		address = paddress;
	}
}
