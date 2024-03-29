package chapter7.array;

// 다차원 배열 : 2차원 배열
public class TwoDimension {
	public static void main(String[] args) {
		
		// 2차원 배열
		// 2*3 : 2행 3열
		int[][] arr = {
						{1, 2, 3}, // arr[0] 첫번째 행 		arr[0][0], arr[0][1], arr[0,2]
						{4, 5, 6}  // arr[1] 두번째 행 		arr[1][0], arr[1][1], arr[1,2]
					  };
		
		// 1, 2, 3
		// 4, 5, 6
		
		// [0,0] => 1, [0,1] => 2, [0,2] => 3
		// [1,0] => 4, [1,1] => 5, [1,2] => 6
		
		
		// 2차원배열 출력
		// arr.length : 2, 몇행?
		for(int i = 0; i < arr.length; i++) { // 행
			for(int j = 0; j < arr[i].length; j++) { //열
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("arr.length : " + arr.length);
		System.out.println("첫 번째 행(arr[0])은 열이 몇개 ? " + arr[0].length );
		System.out.println("두 번째 행(arr[1])은 열이 몇개 ? " + arr[1].length );

		System.out.println(arr[0][1]); // 2
		System.out.println(arr[1][2]); // 6
	}
}
