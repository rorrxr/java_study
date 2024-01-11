package chapter5.methodpart;

public class Operator {
	int x;
	int y;
	
	// x, y의 두 변수를 사용하여, 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 리턴하는 메서드를 정의.
	
	// 덧셈 : plus 리턴값 : int 매개변수 없음
	public int plus() {
		return x + y;
	}
	
	// 뺼셈 : minus 리턴값 : int 매개변수 없음
	public int minus() {
		return x - y;
	}
	
	
	// 곱셈 : multiply 리턴값 : int 매개변수 없음
	public int multiply() {
		return x * y;
	}
	
	
	// 나눗셈 : divide 리턴값 : double 매개변수 없음
	public double divide() {
		return x / (double)y;
		// return (double) (x/y);
	}
	
	// 메소드명 : setX 리턴값이 없고, 매개변수 a 	a변수의 값을 x에 대입
	public void setX(int a) {
		x = a;
	}
	
	// 메소드명 : setY 리턴값이 없고, 매개변수 b 	b변수의 값을 y에 대입
	public void setY(int b) {
		y = b;
	}
	
	// x, y의 두 변수를 사용하여, 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하는 메서드를 정의.
	// 공통 사항 : 리턴값이 없다. 매개변수도 없다.
	// 덧셈 출력 : print_plus
	// 뺄셈 출력 : print_minus
	// 곱셈 출력 : print_multiply
	// 나눗셈 출력 : print_divide

	public void print_plus(){
		System.out.println(x+y);
	}

	public void print_minus(){
		System.out.println(x-y);
	}

	public void print_multiply(){
		System.out.println(x*y);
	}

	public void print_divide(){
		System.out.println(x/y);
	}
	
	
}
