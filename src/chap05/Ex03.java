package chap05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuCount, total = 0, stuAverage;
		int[] stuScores;

		System.out.print("�л� ���� �Է��ϼ���: ");
		stuCount = sc.nextInt();

		stuScores = new int[stuCount];

		System.out.printf("%d���� �л����� ������ �Է��ϼ���: ", stuScores.length);
		for (int i = 0; i < stuScores.length; i++) {
			stuScores[i] = sc.nextInt();
			total += stuScores[i];
		}
		System.out.println("\n[�Է��� �л��� ����]");

		System.out.printf("\n����: %d, ���: %.2f", total, (double) total / stuScores.length);
	}
}