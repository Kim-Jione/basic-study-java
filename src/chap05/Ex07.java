package chap05;

import java.util.Scanner;
/*
	사용자에게 3명의 학생에 대한 국어, 영어, 수학, 과학 점수를 입력 받아 1등인 학생의 성적과 총점, 평균을 출력하는 코드를 작성하세요.
	-----------------------------------------------------------------------------------------------------------
	실행 예]
	1번째 학생의 국어, 영어, 수학, 과학 점수를 입력하세요: 80 70 85 80
	2번째 학생의 국어, 영어, 수학, 과학 점수를 입력하세요: 90 85 95 80
	3번째 학생의 국어, 영어, 수학, 과학 점수를 입력하세요: 70 80 85 75
*/

public class Ex07 {
// 배열의 값들을 비교해서 최고값, 최솟값 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[3][4]; // 1. 크기가 4인 1차원 배열을 3개 만들어라
		int total = 0, firstIdx = 0, temp; 
		// 2. 학생별 국어, 영어, 수학, 과학 점수를 입력받는다.
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번째 학생의 국어, 영어, 수학, 과학 점수를 입력하세요: ", i + 1);
			temp = 0;
			// 3. 각 배열 자릿수에 맞게 입력값을 넣어준다.
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = sc.nextInt();
				// 4. 각 학생마다 temp에 국어~총 합을 넣어준다.
				temp += scores[i][j];
			}
			if (temp > total) {
				total = temp;
				firstIdx = i;
			}
		}
		sc.close();
		System.out.print("\n 1등 학생의 성적: ");
		for (int i = 0; i < scores[firstIdx].length; i++) {
			System.out.printf("%2d ", scores[firstIdx][i]);
		}
		System.out.printf("\n 총점: %d, 평균: %.2f \n", total, (double) total / scores[firstIdx].length);
	}

}