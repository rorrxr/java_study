package chapter7.array;

public class BookArray2 {
	public static void main(String[] args) {
		
		// 5개 객체 생성
		// 스택영역에 5개 각각 생성
		Book b1; // = new Book();
		Book b2; // = new Book();
		Book b3; // = new Book();
		Book b4; // = new Book();
		Book b5; // = new Book();
		
		
		// 배열 요소 5개로 객체 배열 생성
		// 스택 영역과 힙 영역에 정보 생성
		Book[] library = new Book[5]; // library[0] ...... library[4]
		
		
		// 힙 영역에 데이터를 생성하는 기억장소 생성 작업
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살것인가?", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐페리");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		
	}
}
