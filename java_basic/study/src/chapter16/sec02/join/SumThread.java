package chapter16.sec02.join;

public class SumThread extends Thread /*implements Runnable*/{

	private long sum;
	
	@Override
	public void run() {
		// 1~100까지 누적된 합을 sum에 저장
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	
}
