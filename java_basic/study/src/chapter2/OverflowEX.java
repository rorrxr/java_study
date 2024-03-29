package chapter2;

public class OverflowEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int형 범위 : -2,147,483,648 ~ 2,147,483,647 	총 10자리
		// 자바에서는 숫자를 사용하면, int형 데이터로 기본으로 인식한다.
		// 값의 범위가 int 범위보다 크면 에러가 발생되어, 값에 뒤에 접미사 L OR l을 붙이면 long형 데이터로 사용할 수가 있다.
		// int num1 = 1234567890; // 11자리라서 값이 int형 범위를 초과하여 오류가 발생한다.
		long num2 = 123456789000L; // long은 int형보다 더 많은 값의 범위의 값을 저장할 수 있기 때문에 오류가 발생하지 않는다.  
	}

}
