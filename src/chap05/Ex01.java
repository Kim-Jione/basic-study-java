package chap05;

public class Ex01 {

	public static void main(String[] args) {
		int[] score;
		score = new int[5];
		System.out.printf("%d %d %d %d %d \n", score[0], score[1], score[2], score[3], score[4]);

		score[0] = 95;
		score[1] = 80;
		score[2] = 90;
		score[3] = 100;
		score[4] = 75;
		System.out.printf("%d %d %d %d %d \n", score[0], score[1], score[2], score[3], score[4]);

	}
}