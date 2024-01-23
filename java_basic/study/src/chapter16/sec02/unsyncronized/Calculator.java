package chapter16.sec02.unsyncronized;

// 자원으로 사용할 클래스
public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2초간 일시정지
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
