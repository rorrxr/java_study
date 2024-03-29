package chapter4.ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		// 선택문 : switch
		
		int ranking = 1; // 1, 2, 3 기타 이외의 값
		char medalColor; 
		
		// Ranking 변수가 갖게 되는 경우의 수를 case 값으로 작업을 한다.
		switch(ranking) {
		case 1: 
			medalColor = 'G';
			break;
		case 2: 
			medalColor = 'S';
			break;
		case 3: 
			medalColor = 'B';
			break;
		default: 
			medalColor = 'A';
			break;
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
	}

}
