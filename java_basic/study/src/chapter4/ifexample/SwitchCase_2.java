package chapter4.ifexample;

public class SwitchCase_2 {

	public static void main(String[] args) {
		// 선택문 : switch
		
		String medal = "Gold"; 
		
		// Ranking 변수가 갖게 되는 경우의 수를 case 값으로 작업을 한다.
		switch(medal) {
		case "Gold": 
			System.out.println("메달의 색깔은 금메달입니다.");
			break;
		
		case "Silver": 
			System.out.println("메달의 색깔은 은메달입니다.");
			break;
		
		case "Bronze": 
			System.out.println("메달의 색깔은 동메달입니다.");
			break;
		
		default:
			System.out.println("메달이 없음");
			break;
		}
	}

}
