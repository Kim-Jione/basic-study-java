package chap04;

/*
	���� ������ 0������ 100�� ������ ���̾�� �մϴ�.
	�ùٸ� ���� �ԷµǴ� ��쿡�� �л��� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
 */
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���: ");
		int score = sc.nextInt();
		sc.close();

		String grade = "";
		if (0 <= score && score <= 100) {

			if (score >= 90 && score >= 98) {// ���� �ǹ̴� ��ø�� �ʿ䰡 ����.
				grade += "A+";
			} else if (score >= 90 && score < 94) {
				grade += "A-";
			} else if (score >= 80 && score >= 88) {
				grade += "B+";
			} else if (score >= 80 && score < 84) {
				grade += "B-";
			} else {
				grade = "C";
			}
			System.out.println("����� ������: " + grade);
		} else {
			System.out.println("0���� 100 ������ �ùٸ� ���� �Է��ϼ���.");
		}

	}
}
