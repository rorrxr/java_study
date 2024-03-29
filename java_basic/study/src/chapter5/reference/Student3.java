package chapter5.reference;

public class Student3 {
	int studentID; // 학번
	String studentName; // 학생이름
	
	// 필드가 클래스로 선언되면, 초기값은 null로 된다.
	Subject korean; // 국어점수
	Subject math; // 수학점수
	
	
	public Student3(){
		// 중요, 주석 걸고(Student3Test.java) 안 걸고 차이점을 알아두기.
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
}
