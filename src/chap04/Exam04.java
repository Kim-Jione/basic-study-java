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
		int year, month, monthLastDay = 31;
		System.out.println("�⵵�� ���� �Է��ϼ���.: ");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			monthLastDay = 30;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
				monthLastDay = 29;
			} else {
				monthLastDay = 28;
			}
			break;
		}
		System.out.printf("%d�� %d���� ������ ���ڴ� %d�� �Դϴ�.", year, month, monthLastDay);
	}
}