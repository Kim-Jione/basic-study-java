package chap05;

import java.util.Scanner;
/*
	����ڿ��� 3���� �л��� ���� ����, ����, ����, ���� ������ �Է� �޾� 1���� �л��� ������ ����, ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
	-----------------------------------------------------------------------------------------------------------
	���� ��]
	1��° �л��� ����, ����, ����, ���� ������ �Է��ϼ���: 80 70 85 80
	2��° �л��� ����, ����, ����, ���� ������ �Է��ϼ���: 90 85 95 80
	3��° �л��� ����, ����, ����, ���� ������ �Է��ϼ���: 70 80 85 75
*/

public class Ex07 {
// �迭�� ������ ���ؼ� �ְ�, �ּڰ� ���ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[3][4]; // 1. ũ�Ⱑ 4�� 1���� �迭�� 3�� ������
		int total = 0, firstIdx = 0, temp; 
		// 2. �л��� ����, ����, ����, ���� ������ �Է¹޴´�.
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d��° �л��� ����, ����, ����, ���� ������ �Է��ϼ���: ", i + 1);
			temp = 0;
			// 3. �� �迭 �ڸ����� �°� �Է°��� �־��ش�.
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = sc.nextInt();
				// 4. �� �л����� temp�� ����~�� ���� �־��ش�.
				temp += scores[i][j];
			}
			if (temp > total) {
				total = temp;
				firstIdx = i;
			}
		}
		sc.close();
		System.out.print("\n 1�� �л��� ����: ");
		for (int i = 0; i < scores[firstIdx].length; i++) {
			System.out.printf("%2d ", scores[firstIdx][i]);
		}
		System.out.printf("\n ����: %d, ���: %.2f \n", total, (double) total / scores[firstIdx].length);
	}

}