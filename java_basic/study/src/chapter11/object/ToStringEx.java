package chapter11.object;

class Book /* extends Object*/{
	
	int bookNumber;
	String bookTitle;
	
	// 생성자
	public Book(int bookNumber, String bookTitle) {
		//super(); //컴파일 과정에서 자동 생성. 상위 글래스의 생성자 호출
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// Object 클래스의 toString() 메서드를 재정의
	// 용도 : 클래스만 필드들의 정보
	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book(200, "개미");
		
		// toString()메서드 재정의 하지 않으면 Object 클래스에서 제공하는 toString 메서드 호출
		// chapter11.object.Book@7c30a502
		// toString() 메서드 재정의가 되어있으면, 재정의된 메서드를 호출한다. 개미 200
		System.out.println(book1);
	}

}
