package chapter8.polymophism;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal animal = new Human();
		animal.move(); // Human 클래스의 재정의된 move()메서드 호출
		
		animal = new Tiger();
		animal.move(); // Tiger 클래스의 재정의된 move()메서드 호출
		
		animal = new Eagle();
		animal.move(); // Eagle 클래스의 재정의된 move()메서드 호출
	}
}
