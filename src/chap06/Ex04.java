package chap06;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		for (int num : arr1) {// num ������ ���� ����� �迭�� ���� �ƴ϶� ������ ���̴�.
			num = num * 2; // ���� �迭�� ������ ���� ���Ѵ�.
		}
		for (int i = 0; i < arr2.length; i++) {// ���� �迭�� ����� ���� ���� ����
			arr2[i] = arr2[i] * 2;
		}
		for (int num : arr2) {
			System.out.print(num + " ");
		}
	}

}