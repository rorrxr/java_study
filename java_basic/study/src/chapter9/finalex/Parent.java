package chapter9.finalex;

// sealed 키워드 미사용시 상속이 가능하다.
public class Parent {
	
}

class Child extends Parent {
	
}


// sealed 키워드 사용시 클래스는 상속이 불가능하다.
//sealed class TestA {
//	
//}

/*
 
  // 상속 금지 에러 발생.
  class TestB extends TestA {
  
  }
  
 */

// final 키워드 사용시 클래스는 상속이 불가능하다.
final class TestA{

}