package chap04;

/*
 2�ܺ��� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 ��, ��ø �ݺ����� ����ϼ���.
 
 ���� ��]
 [ 2 �� ]
 2 * 1 =  2
 2 * 2 =  4
 2 * 3 =  6
 . . .
 2 * 9 = 18
 
  [ 3 �� ]
 3 * 1 =  3
 . . .
 4 * 9 = 36
 

*/

public class Gugudan04 {

	public static void main(String[] args) {
		int dan, num;
		for (dan = 2; dan <= 9; dan++) {
			for (num = 1; num <= 9; num++) {
				System.out.printf("\n %d * %d = %2d", dan, num, dan * num);
			}
		}

	}
}