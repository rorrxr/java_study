package chapter7.array;

// 얕은 복사 예제 - 주소만 복사
public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3]; // 객체 배열
		Book[] bookArray2 = new Book[3]; // 객체 배열
		
		// 힙 영역에 실제 데이터가 생성되는 기억장소가 생성.
		// bookArray1 배열에 데이터작업. bookArray2 배열은 기본값
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		// bookArray1 배열에서, bookArray2 배열로 3개의 데이터가 복사.
 		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
 		// 복사된 배열의 데이터를 출력
		System.out.println("=== bookArray2 ==="); // 1 사본
		for(int i=0; i<bookArray2.length; i++){
			bookArray2[i].showBookInfo();
		}
		
		// 원본 배열에 데이터 변경 작업을 하게 되면,
		// bookArray2의 참조타입 멤버들은 bookArray1 참조 타입 멤버들의 주소가 동일하기 떄문에
		// bookArray1, bookArray2로 참조타입 멤버의 값을 변경하게 되면
		// 항상 같을 수 밖에 없다.
		// 원본 배열에 데이터 변경 작업
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		// 원본 배열 출력
		System.out.println("=== bookArray1 ==="); // 2 원본
		for(int i=0; i<bookArray1.length; i++){
			bookArray1[i].showBookInfo();
		}
		
		// 사본 배열 출력
		System.out.println("=== bookArray2 ==="); // 1 사본
		for(int i=0; i<bookArray2.length; i++){
			bookArray2[i].showBookInfo();
		}
	}
}
