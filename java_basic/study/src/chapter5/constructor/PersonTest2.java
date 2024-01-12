package chapter5.constructor;

public class PersonTest2 {
	public static void main(String[] args) {
		Person p1 = new Person(); //객체 생성 구문
		p1.name = "이순신";
		p1.height = 80;
		p1.weight = 75;

		System.out.println(p1.name);
		System.out.println(p1.height);
		System.out.println(p1.weight);
	}
}
