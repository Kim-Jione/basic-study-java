package chap06;

public class Ex01 {
	public static void main(String[] args) {
		String[] fruits = { "���", "����", "�ٳ���", "������", "����" };// ����, ����, �ʱ�ȭ�� �� ����

//		int[] lotto = new int[6];
//
//		lotto[0] = 7;
//		lotto[1] = 12;
//		lotto[2] = 19;
//		lotto[3] = 25;
//		lotto[4] = 33;
//		lotto[5] = 40;

//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}

//		for (int num : lotto) {
//			System.out.print(num + " ");
//		}

		// ���� for ���� ����Ͽ� ��� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		for (String string : fruits) {
			System.out.print(string + " ");
		}

	}
}