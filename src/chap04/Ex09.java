package chap04;

public class Ex09 {

	public static void main(String[] args) {
		int total = 0;

//		for (int i = 1; i <= 100; i++) {
//			total += i;
//		}
//		System.out.println("1 ���� 100������ ��: " + total);

		int i = 1; // 1. �ʱ���� ����.
		do {// 3. ���Ǹ� ���� �ȴ�.
			total += i;
			i++;// 2. �������� ������ �������� ����.
		} while (i <= 100);
		System.out.println("1 ���� 100������ ��: " + total);
	}
}