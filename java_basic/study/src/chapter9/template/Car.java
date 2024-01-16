package chapter9.template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// final 키워드 : 자식 클래스에서 재정의를 하지 못하게 막는 기능
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
