package chapter9.abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer c1 = new Computer(); // 추상 클래스이므로 객체 생성 불가능
		Computer c2 = new DeskTop(); 
//		Computer c3 = new NoteBook(); // 추상 클래스이므로 객체 생성 불가능
		Computer c4 = new MyNoteBook(); // 할아버지 클래스와 손자 클래스
		
	}

}
