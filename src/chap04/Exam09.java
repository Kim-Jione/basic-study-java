package chap04;

import java.util.Scanner;

/*
 * 
 */
public class Exam09 {
	public static void main(String[] args) {

		int user, com;
		String userStr = "", comStr = "", result = "�����ϴ�";
		String intro = "\n\t[���������� ����] \n" + " \n" + " \t 1. ���� \n" + " \t 2. ���� \n" + " \t 3. �� \n" + " \t >>>";
		boolean isWin = false;
		Scanner sc = new Scanner(System.in);
		System.out.print(intro);

		do { // 1. ���������� 1ȸ ����
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

		} while (true);
	}
}