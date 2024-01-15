package chapter7.array;

public class CharArrayReverse {
	public static void main(String[] args) {
		char[] alpahabets = new char[26];
		char ch = 'Z'; // 90
		
		// ch를 --로 하면 Z부터 A까지 역순으로 출력된다
		for(int i = 0; i < alpahabets.length; i++, ch--) {
			alpahabets[i] = ch; // i = 0일 경우 90을 저장
		}
		
		for(int i = 0; i < alpahabets.length; i++) {
			System.out.println(alpahabets[i] + "," + (int)alpahabets[i]);
		}
	}
}
