package chap04;

public class Ex05 {

	public static void main(String[] args) {
		// 1���� 100 ������ �� �� Ȧ���� �հ� ¦���� ���� ���ÿ� ���Ͽ� �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.

		int iTotal = 0, jTotal = 0;

		for (int i = 1, j = 2; i <= 100 && j <= 100; i += 2, j += 2) {
			iTotal += i;
			jTotal += j;

		}
		System.out.println("1���� 100 ������ �� �� Ȧ���� ��: " + iTotal);
		System.out.println("1���� 100 ������ �� �� ¦���� ��: " + jTotal);

	}
}