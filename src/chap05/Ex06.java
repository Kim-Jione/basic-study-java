package chap05;

public class Ex06 {
// 배열의 값들을 비교해서 최고값, 최솟값 구하기
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println("arr 배열의 크기: " + arr.length);
		System.out.println("arr[0] 배열의 크기: " + arr[0].length);
		System.out.println("arr[1] 배열의 크기: " + arr[1].length);
		System.out.println("arr[2] 배열의 크기: " + arr[2].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);

			}System.out.println();
		}
	}
}