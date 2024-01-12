package chapter5.constructor;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stu1 : 기본생성자 출력
		Student stu1 = new Student();
		System.out.println(stu1.studentID);
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.address);
		System.out.println();
		
		// stu2 : 생성자1 홍길동 출력
		Student stu2 = new Student("홍길동");
		System.out.println(stu2.studentID);
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.address);
		System.out.println();

		// stu3 : 생성자 2 홍길동, 노원구 출력
		Student stu3 = new Student("홍길동", "노원구");
		System.out.println(stu3.studentID);
		System.out.println(stu3.name);
		System.out.println(stu3.age);
		System.out.println(stu3.address);


	}

}
