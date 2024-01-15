package chapter7.array;

public class BookArray {
	public static void main(String[] args) {
		// 5개 객체 생성
		// 스택영역에 5개 각각 생성
		Book b1; // = new Book();
		Book b2; // = new Book();
		Book b3; // = new Book();
		Book b4; // = new Book();
		Book b5; // = new Book();
		
		// 객체가 생성되지 않은 상태에서는 사용 불가능. NPE (Null Pointer Exception) 에러
		// System.out.println(b1);
		// System.out.println(b2);
		// System.out.println(b3);
		// System.out.println(b4);
		// System.out.println(b5);
		
		// 배열 요소 5개로 객체 배열 생성
		// 스택 영역과 힙 영역에 정보 생성
		Book[] library = new Book[5]; // library[0] ...... library[4]
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		
	}
}
