package chap05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuCount, total = 0, stuAverage;
		int[] stuScores;

		System.out.print("학생 수를 입력하세요: ");
		stuCount = sc.nextInt();

		stuScores = new int[stuCount];

		System.out.printf("%d명의 학생들의 점수를 입력하세요: ", stuScores.length);
		for (int i = 0; i < stuScores.length; i++) {
			stuScores[i] = sc.nextInt();
			total += stuScores[i];
		}
		System.out.println("\n[입력한 학생의 점수]");

		System.out.printf("\n총점: %d, 평균: %.2f", total, (double) total / stuScores.length);
	}
}