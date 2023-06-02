package chap05;

public class Ex04 {
// 배열의 값들을 비교해서 최고값, 최솟값 구하기
	public static void main(String[] args) {
		int[] scores = { 80, 75, 60, 85, 100, 60 };
		int minScore, maxScore;
		// 1. 어떤 수를 최고값, 최솟값이라고 가정한다.
		minScore = scores[0];
		maxScore = scores[0];

		for (int i = 1; i < scores.length; i++) {
			if (minScore > scores[i]) {
				minScore = scores[i];
			}
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}System.out.printf("최고 점수: %d, 최저 점수: %d \n",maxScore, minScore);
	}
}