package chap04;

/*
 ����ڿ��� �������� ���� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 
 ���� ��]
 �������� ���� �Է��ϼ���: 4
 
  [ 4 �� ]
 4 * 1 =  4
 4 * 2 =  8
 4 * 3 = 12
 . . .
 4 * 9 = 36
*/
import java.util.Scanner;

public class Gugudan01 {

	public static void main(String[] args) {
		int dan, total;

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �Է��ϼ���: ");
		dan = sc.nextInt();
		sc.close();
		System.out.printf("\n  [ %d �� ]", dan);
		

		for (int num = 1; num <= 9; num++) {
			total = dan * num;
			System.out.printf("\n %d * %d = %2d", dan, num, total);
		}

	}
}