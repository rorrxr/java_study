package chapter7.array;

// 깊은 복사 예제 : 메모리가 복사 시 동일한 메모리가 복사되어야 한다.
// Object의 clone 메소드 이용한 깊은 복사 내용이 있다.
public class ObjectCopy3 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
 		
		// 실제 데이터가 저장되는 힙 영역의 기억장소 생성
		bookArray2[0] = new Book(); //객체 직접 생성
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i=0; i<bookArray1.length; i++){   // 각각의 요소를 복사
			// bookArray1 배열의 값을 bookArray2 배열에 복사
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i=0; i<bookArray2.length; i++){  //복사된 내용 확인
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");   //bookArray1 의 내용 수정
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");    //bookArray1 출력
		for(int i=0; i<bookArray1.length; i++){
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");    //bookArray2 출력
		for(int i=0; i<bookArray2.length; i++){
			bookArray2[i].showBookInfo();   // bookArray1 과 다른 내용으로 출력됨
		}
	}
}
