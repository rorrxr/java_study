package chapter16.sec02.syncronized;

// 스레드 클래스
public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
