package ez0221.java.exam07.third;

public class Student extends People{
	private int StudentNo;

	public int getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}
	
	Student(int studentNo){
		this.StudentNo = studentNo;
	}
	
	Student(String name, String ssn, int studentNo){
		super(name, ssn);
		this.StudentNo = studentNo;
	}
	
	Student(){
		
	}
	
	
}
