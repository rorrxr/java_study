package chapter14.exception;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 힙 영역에 int형 기억장소 5개 생성.
		
		// arr[0] ~ arr[4] 힙 영역에 생성된 기억장소 요소를 가리키는 이름
		
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException 오류 발생
		// arr[5] = 10; 
		
		// 예외처리 : 실행시 예외 발생되면 강제적인 종료를 막고, 실행이 정상적으로 종료하기 위한 목적
		// 예외처리 문법 : try catch 문 사용
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
				
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		
		System.out.println("프로그램 종료");
		
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		System.out.println("테스트");
	}
}
