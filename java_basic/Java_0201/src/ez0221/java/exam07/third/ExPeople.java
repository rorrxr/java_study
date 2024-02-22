package ez0221.java.exam07.third;

public class ExPeople {

	public static void main(String[] args) {
		
		Student stu1 = new Student(1706065);
		
		System.out.println("stu1.getName : " + stu1.getName());
		System.out.println("stu1.getSsn : " + stu1.getSsn());
		System.out.println("stu1.getStudentNo : " + stu1.getStudentNo());
		System.out.println("=========");
		
		Student stu2 = new Student("김민주", "980707-2", 2206062);
		System.out.println("stu2.getName : " + stu2.getName());
		System.out.println("stu2.getSsn : " + stu2.getSsn());
		System.out.println("stu2.getStudentNo : " + stu2.getStudentNo());
		
		
	}

}
