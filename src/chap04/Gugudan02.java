package chap04;

/*
 2�ܺ��� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 ��, �ϳ��� for �ݺ����� ����մϴ�.
 
 ���� ��]

 2 * 1 =  2
 2 * 2 =  4
 2 * 3 =  6
 . . .
 3 * 1 =  1
*/

public class Gugudan02 {

	public static void main(String[] args) {
		int dan = 2, num = 1;
		for (int i = 0; i < 72; i++) {
			System.out.printf("%d * %d = %2d\n", dan, num, dan);
			num++;
			if (num == 10) {
				dan++;
				num = 1;
			}
		}

	}
}