package chapter7.array;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 참조타입은 기본값이 null로 초기화된다.
		// 배열 기본값이 null로 초기화된다.
		
		// 데이터타입[] 배열명 = new 데이터타입[배열 데이터의 크기]
		// 스택(Stack) 영역 = 힙 데이터영역
		// 힙 데이터영역으로 5개의 데이터 영역
		
		double[] data = new double[5]; // 힙 영역에 생성된 기억장소의 초기값은 0.0 => {0.0, 0.0, 0.0, 0.0, 0.0};
		
		// 값을 변경
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		data[3] = 40.0;
		data[4] = 50.0;
		
		// data.length : 배열의 길이=> 5
		// 힙 영역에 생성된 배열 기억장소 요소의 개수
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
 		
	}
}
