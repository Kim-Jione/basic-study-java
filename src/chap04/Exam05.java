package chap04;

/*
[ ���������� ����]

1. ����
2. ����
3. ��
>>> 3

����� ��, ��ǻ�� ����
���������� ��� ==> �����ϴ�.
=========================
[�ڵ� �ۼ� ����]
1. switch ���� �̿��Ͽ� ������ �ذ��ϼ���.
2. if ���� �̿��Ͽ� ������ �ذ��ϼ���.

 */

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ��");

		Scanner sc = new Scanner(System.in);
		int userValue = sc.nextInt();
		int computerValue = (int) (Math.random() * 3 + 1);// 1~3
		System.out.printf(">>> %d\n\n", userValue);

		int ���� = 1;
		int ���� = 2;
		int �� = 3;
//		switch (user) {
//		case 1: {
//			switch (computerRan) {
//			case 1:	
//				System.out.println("����� ����, ��ǻ�� ����");
//				System.out.println("���������� ��� ==> �����ϴ�.");
//				break;
//
//			case 2:
//				System.out.println("����� ����, ��ǻ�� ����");
//				System.out.println("���������� ��� ==> �����ϴ�.");
//				break;
//
//			case 3:
//				System.out.println("����� ����, ��ǻ�� ��");
//				System.out.println("���������� ��� ==> �̰���ϴ�.");
//				break;
//
//			}
//		}
//			break;
//		case 2: {
//			switch (computerRan) {
//			case 1:
//				System.out.println("����� ����, ��ǻ�� ����");
//				System.out.println("���������� ��� ==> �̰���ϴ�.");
//				break;
//
//			case 2:
//				System.out.println("����� ����, ��ǻ�� ����");
//				System.out.println("���������� ��� ==> �����ϴ�.");
//				break;
//
//			case 3:
//				System.out.println("����� ����, ��ǻ�� ��");
//				System.out.println("���������� ��� ==> ����ϴ�.");
//				break;
//
//			}
//		}
//			break;
//		case 3: {
//			switch (computerRan) {
//			case 1:
//				System.out.println("����� ��, ��ǻ�� ����");
//				System.out.println("���������� ��� ==> �����ϴ�.");
//				break;
//
//			case 2:
//				System.out.println("����� ��, ��ǻ�� ����");
//				System.out.println("���������� ��� ==> �̰���ϴ�.");
//				break;
//
//			case 3:
//				System.out.println("����� ��, ��ǻ�� ��");
//				System.out.println("���������� ��� ==> �����ϴ�.");
//				break;
//
//			}
//		}
//			break;
//		}
		if (userValue == ���� && computerValue == ����) {
			System.out.println("����� ����, ��ǻ�� ����");
			System.out.println("���������� ��� ==> �����ϴ�.");
		}
		if (userValue == ���� && computerValue == ����) {
			System.out.println("����� ����, ��ǻ�� ����");
			System.out.println("���������� ��� ==> �����ϴ�.");

		}
		if (userValue == ���� && computerValue == ��) {
			System.out.println("����� ����, ��ǻ�� ��");
			System.out.println("���������� ��� ==> �̰���ϴ�.");

		}

		if (userValue == ���� && computerValue == ����) {
			System.out.println("����� ����, ��ǻ�� ����");
			System.out.println("���������� ��� ==> �̰���ϴ�.");

		}
		if (userValue == ���� && computerValue == ����) {
			System.out.println("����� ����, ��ǻ�� ����");
			System.out.println("���������� ��� ==> �����ϴ�.");

		}
		if (userValue == ���� && computerValue == ��) {
			System.out.println("����� ����, ��ǻ�� ��");
			System.out.println("���������� ��� ==> ����ϴ�.");

		}

		if (userValue == �� && computerValue == ����) {
			System.out.println("����� ��, ��ǻ�� ����");
			System.out.println("���������� ��� ==> �����ϴ�.");

		}
		if (userValue == �� && computerValue == ����) {
			System.out.println("����� ��, ��ǻ�� ����");
			System.out.println("���������� ��� ==> �̰���ϴ�.");

		}
		if (userValue == �� && computerValue == ��) {
			System.out.println("����� ��, ��ǻ�� ��");
			System.out.println("���������� ��� ==> �����ϴ�.");
		} else {
			System.out.println("1, 2, 3�� �ϳ��� ���ڸ� �Է����ּ���.");

		}
	}
}