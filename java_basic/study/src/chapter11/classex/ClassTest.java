package chapter11.classex;

// Class 클래스
public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		// pClass : Person 클래스에 대한 정보를 참조하는 객체
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName()); // chapter11.classex.Person
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName()); // chapter11.classex.Person
		
		// 클래스 fullName : 패키지명.클래스이름
		Class pClass3 = Class.forName("chapter11.classex.Person");
		System.out.println(pClass3.getName()); // chapter11.classex.Person
	}

}
