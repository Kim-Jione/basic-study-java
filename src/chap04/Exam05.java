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
		int user = sc.nextInt();
		int computerRan = (int) (Math.random() * 3 + 1);// 1~3
		System.out.printf(">>> %d\n\n", user);

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

		if (user == 1) {
			if (computerRan == 1) {
				System.out.println("����� ����, ��ǻ�� ����");
				System.out.println("���������� ��� ==> �����ϴ�.");
			}
			if (computerRan == 2) {
				System.out.println("����� ����, ��ǻ�� ����");
				System.out.println("���������� ��� ==> �����ϴ�.");

			}
			if (computerRan == 3) {
				System.out.println("����� ����, ��ǻ�� ��");
				System.out.println("���������� ��� ==> �̰���ϴ�.");

			}
			return;
		}
		if (user == 2) {

			if (computerRan == 1) {
				System.out.println("����� ����, ��ǻ�� ����");
				System.out.println("���������� ��� ==> �̰���ϴ�.");

			}
			if (computerRan == 2) {
				System.out.println("����� ����, ��ǻ�� ����");
				System.out.println("���������� ��� ==> �����ϴ�.");

			}
			if (computerRan == 3) {
				System.out.println("����� ����, ��ǻ�� ��");
				System.out.println("���������� ��� ==> ����ϴ�.");

			}
			return;
		}
		if (user == 3) {

			if (computerRan == 1) {
				System.out.println("����� ��, ��ǻ�� ����");
				System.out.println("���������� ��� ==> �����ϴ�.");

			}
			if (computerRan == 2) {
				System.out.println("����� ��, ��ǻ�� ����");
				System.out.println("���������� ��� ==> �̰���ϴ�.");

			}
			if (computerRan == 3) {
				System.out.println("����� ��, ��ǻ�� ��");
				System.out.println("���������� ��� ==> �����ϴ�.");
			}
			return;
		} else {
			System.out.println("1, 2, 3�� �ϳ��� ���ڸ� �Է����ּ���.");
		}

	}
}