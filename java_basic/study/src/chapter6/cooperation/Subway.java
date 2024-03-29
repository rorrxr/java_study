package chapter6.cooperation;

public class Subway {
	public String lineNumber; // 지하철 노선 번호
	public int passengerCount; // 승객 정원 수
	public int money; // 수입 액
	
	public Subway(String lineNumber) { // 지하철 노선 초기화
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + " 입니다.");
	}
}
