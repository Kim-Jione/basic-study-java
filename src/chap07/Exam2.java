package chap07;

/*
������ �迭�� �̿��Ͽ� �ߺ����� �ʴ� �ζ� ��ȣ 6���� �����Ͽ� ũ�� ������� ����ϴ� �ڵ带 �ۼ��ϼ���.
��, ��ü���������� �ڵ带 �ۼ��Ͽ��� �մϴ�.
int [] lotto = new int[6];
*/

class Lotto {

	void setNumber(int number) {
	}

	void compare(int[] lotto) {

	}
}

public class Exam2 {

	public static void main(String[] args) {
//		Lotto num = new Lotto();
//		int random = (int) (Math.random() * 45 + 1);
//		num.setNumber(null);
//			
//		
//		for (int i = 0; i < lotto.length; i++) {
//			int random = (int) (Math.random() * 45 + 1); // ���� �ζǹ�ȣ ����
//			lotto[i] = random; // �迭�� 6���� ���� ��ȣ ����
//			num.setNumber(random);
//			System.out.println(lotto[i]);
//		}
		int[] lotto = new int[6];
		int random = (int) (Math.random() * 45 + 1);
		for (int i = 0; i < lotto.length; i++) {
				for (int k = 0; k < lotto.length; k++) {
					lotto[i] = random;
					if (lotto[i] > lotto[k]) {
						System.out.println(lotto[i]);
					}
	
				}
			}

	}
}
