package chap05;

public class Ex04 {
// �迭�� ������ ���ؼ� �ְ�, �ּڰ� ���ϱ�
	public static void main(String[] args) {
		int[] scores = { 80, 75, 60, 85, 100, 60 };
		int minScore, maxScore;
		// 1. � ���� �ְ�, �ּڰ��̶�� �����Ѵ�.
		minScore = scores[0];
		maxScore = scores[0];

		for (int i = 1; i < scores.length; i++) {
			if (minScore > scores[i]) {
				minScore = scores[i];
			}
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}System.out.printf("�ְ� ����: %d, ���� ����: %d \n",maxScore, minScore);
	}
}