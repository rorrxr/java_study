package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// String 클래스의 정보를 확인
public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// String 클래스를 참조하는 객체
		Class strClass = Class.forName("java.lang.String");
		
		// 생성자 정보
		// java.lang.reflect.Constructor[] cons = strClass.getConstructors();
		Constructor[] cons = strClass.getConstructors();

		//Constructor c1; // java.lang.reflect.Constructor c1;
		//Constructor c2; // java.lang.reflect.Constructor c2;
		//Constructor c3; // java.lang.reflect.Constructor c3;
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();		
		System.out.println("=========================");
		
		// 필드 정보
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();		
		System.out.println("=========================");
		
		// 메서드 정보
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
