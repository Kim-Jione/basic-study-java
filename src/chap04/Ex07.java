package chap04;

public class Ex07 {

	public static void main(String[] args) {

		int total = 0;

//		for (int i = 1; i <= 100; i++) {
//			total += i;
//		}
//		System.out.println("1 ���� 100������ ��: " + total);
		
		int i = 1; // 1. �ʱ���� ����.
		while (i <= 100) {// 3. ���Ǹ� ���� �ȴ�.
			total += i;
			i++;// 2. �������� ������ �������� ����.
		}
		System.out.println("1 ���� 100������ ��: " + total);

	}
}