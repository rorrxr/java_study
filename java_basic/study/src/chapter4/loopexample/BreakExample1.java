package chapter4.loopexample;

public class BreakExample1 {

	public static void main(String[] args) {
		// 반복문 : 
		
		int sum = 0;
		int num = 0;
		
		// num 변수의 값이 0 ~ 99 범위의 누적된 값을 sum 변수에 저장
		for(num = 0; sum < 100; num++) {
			sum += num;
		}

		System.out.println("num : " + num);
		System.out.println("sum : " + sum);

	}

}