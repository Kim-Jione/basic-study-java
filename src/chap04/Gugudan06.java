package chap04;

/*
	 2�ܺ��� 9�� ������ ��ü ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	 ��, ��ø �ݺ����� ����ϼ���.
	 
	 			if (dan == 2) {
				System.out.printf("  [ %d �� ]", dan);
			} else {
				System.out.printf("\n\n  [ %d �� ]", dan);

			}
*/

public class Gugudan06 {

	public static void main(String[] args) {
		int dan, num;

		for (num = 1; num <= 9; num++) {
			for (dan = 2; dan <= 9; dan++) {
				if(dan==9) {
					System.out.printf("%d * %d = %2d      \n", dan, num, dan * num);
					
				}else {
					System.out.printf("%d * %d = %2d      ", dan, num, dan * num);
					
				}
			}
		}

	}
}