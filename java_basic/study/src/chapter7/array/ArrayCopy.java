package chapter7.array;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] array1 = {10 ,20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		// array 배열의 인덱스 0번째 위치에서 array2 배열에 인덱스 1 위치에 4개를 복사한다
		// array1 배열의, 0번째 인덱스(array1[0])에, array2 배열의, 첫번째 인덱스(array2[1])에, 4개를 복사한다. 
		System.arraycopy(array1, 0, array2, 1, 4);
				
		for(int i=0; i < array2.length; i++){
			System.out.println(array2[i]);
		}
	}
}
