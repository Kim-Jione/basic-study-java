package chap05;

/*
	�Ʒ��� ���������� ������ �ڵ带 �迭�� �̿��Ͽ�
	���� ȿ������ �ڵ�� �����ϼ���.
*/
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int user, com;
		String[] kbb = { "����", "����", "��" };
		String result = "";
		String intro = "\n\t [ ���������� ���� ] \n" + "\n" + "\t 1. ���� \n" + "\t 2. ���� \n" + "\t 3. �� \n" + "\t >>> ";

		com = (int) (Math.random() * 3);

		System.out.print(intro);
		user = sc.nextInt() - 1;
		sc.close();

		switch (user - com) {
		case 0:
			result = "�����ϴ�.";
			break;
		case 1:
		case -2:
			result = "�̰���ϴ� ... ^^";
			break;
		case -1:
		case 2:
			result = "�����ϴ� ... ��,.��";
			break;
		}

		System.out.printf("\n\t �����: %s, ��ǻ��: %s \n", kbb[user], kbb[com]);
		System.out.printf("\t ���������� ��� ==> %s\n", result);
	}
}