package chap04;

/*
[ ���� ��� ���α׷� ]

����ڿ��� �⵵�� �Է� �޾� �ش� ���� ������ ���ڸ� ����ϴ� �ڵ带 �ۼ��ϼ���.

[���� ��1]						[���� ��2]
�⵵�� ���� �Է��ϼ���: 2023 1			�⵵�� ���� �Է��ϼ���: 2020 2
2023�� 1���� ������ ���ڴ� 31���Դϴ�.	2020�� 2���� ������ ���ڴ� 29���Դϴ�.
==========================================================
[�� ���� ������ ���� �Ǵ� �˰���]
1. ū��: 1, 3, 5, 7, 8, 10, 12 => 31��
2. ������: 4, 6, 9, 11 => 30��
3. 2��: ���� => 29��, ��� => 28��
 */

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� ���� �Է��ϼ���.: ");
		int year = sc.nextInt();
		int month = sc.nextInt();

		if (month == 2) {
			if (year / 4 == (int) year / 4 && year / 100 != (int) year / 100 || year / 400 == (int) year / 400) {

				System.out.printf("%d�� %d���� ������ ���ڴ� 29���Դϴ�.", year, month);
			} else {
				System.out.printf("%d�� %d���� ������ ���ڴ� 28���Դϴ�.", year, month);

			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.printf("%d�� %d���� ������ ���ڴ� 31���Դϴ�.", year, month);
		} else {
			System.out.printf("%d�� %d���� ������ ���ڴ� 30���Դϴ�.", year, month);
		}
	}
}