package chapter9.abstractex;

public abstract class Computer {
	
	// 추상 메서드 : 중앙 정부의 세부 내용이 없는 정책. 예) 출산 정책
	public abstract void display();
	public abstract void typing();
	
	// 일반 메서드 : 중앙 정부의 세부 내용이 있는 정책. 예) 교통 정책
	public void turnOn() {
		System.out.println("천원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("천원을 끕니다.");
	}
}