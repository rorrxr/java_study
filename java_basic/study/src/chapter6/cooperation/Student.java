package chapter6.cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 학생이 이용하는 교통수단
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스 이용 1000원
		this.money -= 1000; // 용돈 1000원 차감
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500); // 버스 이용 1500원
		this.money -= 1500; // 용돈 1500원 차감
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
