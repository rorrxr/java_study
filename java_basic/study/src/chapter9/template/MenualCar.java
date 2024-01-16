package chapter9.template;

public class MenualCar extends Car{
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
	
	// 부모 클래스의 run 메서드가 final로 되어있어 재정의 할 수가 없다.
//	@Override
//	public void run() {
//		System.out.println("에러 발생");
//	}
}
