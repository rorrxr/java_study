package chapter3.operator;

public class OperationEx1 {

	public static void main(String[] args) {
		// 산술 연산자 (+, -, *, /)
		
		int mathScore = 90;
		int engScore = 75;
		
		// 총합 구하기 (+ 연산자 사용)
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		// 평균 구하기 (/ 연산자 사용)
		double avgScore = totalScore / 2.0; // 2 int형 값으로 나누어서는 안 된다.
		System.out.println(avgScore);
		
		
		
	}

}
