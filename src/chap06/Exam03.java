package chap06;

import java.util.Scanner;

// �տ��� �ۼ��� ���������� ��ü�� �̿��Ͽ� ����ڰ� ���Ҷ����� ������������ �Ҽ� �ִ� �ڵ带 �ۼ��ϼ���

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		KawiBawiBo kbb = new KawiBawiBo();
		String input = "";
		String intro = "\n\t[���������� ����] \n" + " \n" + " \t 1. ���� \n" + " \t 2. ���� \n" + " \t 3. �� \n" + " \t >>>";

		while (true) {
			kbb.setCom();

			System.out.print(intro);
			kbb.setUser(sc.nextInt());

			System.out.printf("\n\t����� : %s, ��ǻ�� : %s \n", kbb.getUser(), kbb.getCom());
			System.out.printf("\t ���������� ��� ==> %s\n", kbb.judge());

			sc.nextLine();
			System.out.print("\n\t �����Ͻ÷��� 'q'�� �Է��ϼ��� : ");
			input = sc.nextLine();

			if (input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')) {
				break;
			}
		}
		sc.close();
		System.out.printf("\n\t �̿����ּż� �����մϴ� ... ������ �ٽ� ������~ \n");
	}
}