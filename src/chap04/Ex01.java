package chap04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = "";

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
		System.out.println("����� ������: "+grade);
	}
}
