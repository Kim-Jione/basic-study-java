package chap04;

import java.util.Scanner;

/*
 * [���������� ����]
����ڰ� ���� ������ ����������
 * */
public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;
		String input;
		String userStr = "", comStr = "", result = "�����ϴ�";
		String intro = "\n\t[���������� ����] \n" + " \n" + " \t 1. ���� \n" + " \t 2. ���� \n" + " \t 3. �� \n" + " \t >>>";
		System.out.print(intro);
		while (true) {

			com = (int) (Math.random() * 3);
			user = sc.nextInt() - 1;

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

			System.out.printf("\n\t ����� : %s, ��ǻ�� : %s \n", userStr, comStr);
			System.out.printf("\t ���������� ��� ==> %s\n", result);
			sc.nextLine();
			System.out.printf("\n\t �����Ͻ÷��� 'q'�� �Է��ϼ���: ");
			input = sc.nextLine();
			if (input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')) {
				break;
			}
		}
			sc.close();
			System.out.printf("�̿����ּż� �����մϴ� ... ������ �ٽ� ������ ...^^");

	}
}