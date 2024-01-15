package chapter7.basic;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.a = 10;
		p1.b = 20;

		System.out.println(p1.a);
		System.out.println(p1.b);
		
		System.out.println("======================");
		
		Person p2 = p1; //주소가 복사(대입)		

		System.out.println(p2.a);
		System.out.println(p2.b);
		
		p2.a = 100;
		p2.b = 200;
		
		System.out.println("======================");
		
		System.out.println(p2.a);
		System.out.println(p2.b);
		
	}
}
