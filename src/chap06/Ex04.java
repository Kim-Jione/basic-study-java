package chap06;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		for (int num : arr1) {// num 변수는 실제 저장된 배열의 값이 아니라 복사한 값이다.
			num = num * 2; // 원래 배열에 영향을 주지 못한다.
		}
		for (int i = 0; i < arr2.length; i++) {// 원래 배열에 저장된 값을 직접 변경
			arr2[i] = arr2[i] * 2;
		}
		for (int num : arr2) {
			System.out.print(num + " ");
		}
	}

}