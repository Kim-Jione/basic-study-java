package chap04;

public class Ex08 {

	public static void main(String[] args) {
		// �Ʒ��� ��ø for �ݺ����� ��ø while �ݺ������� ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���.
//		int dan, num;
//
//		for (num = 0; num <= 9; num++) {// ��
//
//			for (dan = 2; dan <= 9; dan++) {// ��
//
//				if (num == 0) {
//					System.out.printf(" [ %d �� ]\t", dan);
//
//				} else {
//					System.out.printf("%d * %d = %2d\t", dan, num, dan * num);
//
//				}
//			}
//			System.out.println();
//		}

		int num = 0;
		while (num <= 9) {
			int dan = 2;// �ڱ� �ڽ� �ݺ��� �ٷ� ���� �÷��� �Ѵ�.
			while (dan <= 9) {
				if (num == 0) {
					System.out.printf(" [ %d �� ]\t", dan);
				} else {
					System.out.printf("%d * %d = %2d\t", dan, num, dan * num);
				}
				dan++;
			}
		}
		System.out.println();
		num++;
	}
}