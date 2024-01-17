package chapter11.classex;

// newInstance()를 사용해 클래스 생성하기
public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		// (1)
		Class pClass = Class.forName("chapter11.classex.Person");
		
		// (2)
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
	}

}
