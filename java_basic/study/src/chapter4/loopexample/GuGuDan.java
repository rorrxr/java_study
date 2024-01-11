package chapter4.loopexample;

public class GuGuDan {

	public static void main(String[] args) {
		// 중첩 for문을 이용한 구구단 예제
		int i;
		int j;
		
		/* 
		// 2 * 1 =, 2 * 2 = ...
		// 3 * 1 = 3 * 2 = ...
		for(i = 2; i < 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + " ");
			}
			System.out.println();
		}
		*/
		
		/*
			첫 번째 for문 : 곱의 기능
			두 번째 for문 : 단의 기능
		*/
		
		for(i = 1; i <= 9; i++) {
			for (j = 2; j < 9; j++) {
				if(i == 0) {
					System.out.print(j + "단");
					continue;
				}
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}

}
