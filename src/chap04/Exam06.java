package chap04;

import java.util.Scanner;
/*
 * [���������� ����]
����ڰ� �̱� ������ ����������
 *
 */

public class Exam06 {
	public static void main(String[] args) {
		int user, com;
		String userStr = "", comStr = "", result = "�����ϴ�";
		String intro = "\n\t[���������� ����] \n" + " \n" + " \t 1. ���� \n" + " \t 2. ���� \n" + " \t 3. �� \n" + " \t >>>";
		boolean isWin = false;
		Scanner sc = new Scanner(System.in);
		System.out.print(intro);

		do { // 1. ���������� 1ȸ ����
			com = (int) (Math.random() * 3);
			user = sc.nextInt()-1;

			switch (user) {
			case 0:
				userStr = "����";
				break;
			case 1:
				userStr = "����";
				break;
			case 2:
				userStr = "��";
				break;
			}

			switch (com) {
			case 0:
				comStr = "����";
				break;
			case 1:
				comStr = "����";
				break;
			case 2:
				comStr = "��";
				break;
			}

			switch (user - com) {
			case 0:
				result = "�����ϴ�.";
				break;
			case 1:
			case -2:
				result = "�̰���ϴ�.";
				break;
			case 2:
			case -1:
				result = "�����ϴ�.";
				break;
			}

			if (result == "�̰���ϴ�.") {
				continue;
			}
			System.out.printf("\n\t����� : %s, ��ǻ�� : %s \n", userStr, comStr);
			System.out.printf("\t ���������� ��� ==> %s\n", result);

		} while (result != "�̰���ϴ�.");
		System.out.printf("\n\t����� : %s, ��ǻ�� : %s \n", userStr, comStr);
		System.out.printf("\t ���������� ��� ==> %s\n", result);
		System.out.printf("�̿����ּż� �����մϴ� ... ������ �ٽ� ������ ...^^");

	}
}