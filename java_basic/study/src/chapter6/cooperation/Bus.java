package chapter6.cooperation;

public class Bus {
	public int busNumber; // 버스 번호
	public int passengerCount; // 승객 정원 수
	public int money; // 수입 액
	
	public Bus(int busNumber) { // 버스 번호 초기화
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + " 입니다.");
	}
}
