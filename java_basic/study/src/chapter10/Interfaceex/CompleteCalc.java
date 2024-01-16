package chapter10.Interfaceex;

// 상속시 extends : 동일한 클래스 또는 인터페이스를 상속받을 때 사용
public class CompleteCalc extends Calculator{
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}