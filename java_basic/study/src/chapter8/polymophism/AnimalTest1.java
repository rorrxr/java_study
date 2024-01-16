package chapter8.polymophism;

// 동물 클래스
// 하나의 파일에 4개의 클래스가 써있지만, 컴파일을 하면 4개의 클래스 파일이 생성된다.
// Human, Tiger, Eagle 클래스의 재정의 된 move() 메서드를 주석을 번갈아가며 실행결과를 확인한다.
// 재정의된 경우에는 자식 클래스의 move() 메서드가 호출되고,
// 재정의가 안 된 경우에는 부모 클래스의 move() 메서드가 호출되도록 설계를 해두었다.
class Animal {
	// 상속받은 Animal  부모 클래스의 move 메소드 재정의
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	
	// 상속받은 Animal  부모 클래스의 move 메소드 재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	// Human만의 메소드
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	
	// 상속받은 Animal  부모 클래스의 move 메소드 재정의
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	// Tiger만의 메소드
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal{

	// 상속받은 Animal  부모 클래스의 move 메소드 재정의
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	
	// Eagle만의 메소드
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

// 추가
class Lion extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}
	
}

public class AnimalTest1{
	// main() 메서드는 AnimalTest1 클래스의 멤버로 생각하면 안 된다.
	// JVM에 의하여 독립적으로 관리되는 실행기능을 담당하는 메서드이다.
	public static void main(String[] args) {
		
		AnimalTest1 aTest = new AnimalTest1();
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
	}
	// 다형성 기능 특징을 갖고 있는 메서드. (중요)
	// 하나의 부모 변수가 상대적으로 여러개의 자식 객체 특징을 갖게 되는 의미
	// 상속과 다형성
	public void moveAnimal(Animal animal) {
		// 재정의 된 메서드일 경우에는 자식 객체의 메서드를 호출한다.
			animal.move();
	}
}