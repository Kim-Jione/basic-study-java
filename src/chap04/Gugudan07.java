package chap04;

/*
	 2�ܺ��� 9�� ������ ��ü ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	 ��, ��ø �ݺ����� ����ϼ���.
	 

*/

public class Gugudan07 {

	public static void main(String[] args) {
		int dan, num;

		for (num = 0; num <= 9; num++) {// ��

			for (dan = 2; dan <= 9; dan++) {// ��

				if (num == 0) {
					System.out.printf(" [ %d �� ]\t", dan);

				} else {
					System.out.printf("%d * %d = %2d\t", dan, num, dan * num);

				}
			}
			System.out.println();
		}

	}
}
