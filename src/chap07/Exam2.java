package chap07;

/*
������ �迭�� �̿��Ͽ� �ߺ����� �ʴ� �ζ� ��ȣ 6���� �����Ͽ� ũ�� ������� ����ϴ� �ڵ带 �ۼ��ϼ���.
��, ��ü���������� �ڵ带 �ۼ��Ͽ��� �մϴ�.
int [] lotto = new int[6];
*/

public class Exam2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45 + 1); // ���� �ζǹ�ȣ ����
			lotto[i] = random; // �迭�� 6���� ���� ��ȣ ����
			System.out.println(lotto[i]);
		}
		for (int j = 0; j < lotto.length; j++) {
			if(lotto[j]>lotto[j-1]) {
				
			}
		}
	}
}
