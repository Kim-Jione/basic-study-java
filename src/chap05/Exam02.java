package chap05;

/*
	�Ʒ��� ���� ������ ���� ��� ���α׷��� �迭�� �̿��Ͽ�
	���� ȿ������ �ڵ�� �����ϼ���.
*/
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month;
		int[] monthLastDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 1. -1�� ������� ������ �ǹ��ϰ� 1~12�� ������
																						// �����ش�.

		System.out.print("�⵵�� ���� �Է��ϼ���: ");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			monthLastDays[2]=29;
		}
			System.out.printf("%d�� %d���� ������ ���ڴ� %d���Դϴ�.", year, month, monthLastDays[month]);
	}
}