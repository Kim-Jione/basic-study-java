package chap04;

/*
 * 1 ���� 100 ������ ��� �Ҽ��� �Ʒ��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 *	  [ ���� ��]
 * 
 * 
 *  2   3   5   7  11
 * 13  17  19  23  29
 * 31  37  41  43  47
 * 53  59  61  67  71
 * 73  79  83  89  97
 * 
 * */
public class Exam08 {
	public static void main(String[] args) {

		// step1) 1�� �ڽ��� ������ 20�� ��� ����� ����ϼ���.

//		for (int i = 2; i <= 20 / 2; i++) {
//			if (20 % i == 0) {
//				System.out.print(i + " ");
//			}
//		}

		// step2) 1�� �ڽ��� ������ 2���� 20������ ��� ���� ���� ����� ���Ͽ� ����ϼ���.
//		for (int i = 2; i <= 20 / 2; i++) {
//			System.out.printf("%d�� ���: ", i);
//
//			for (int j = 2; j <= i / 2; j++) {
//			if (i % j == 0) {
//				System.out.print(j + " ");
//			}
//		}
//			System.out.println();
//		}

		// step3) 1���� 100 ������ ��� �Ҽ��� ���Ͽ� ����ϼ���.

//		for (int i = 2; i <= 100 ; i++) {
//			boolean isPrime = true; // ������ i ���� �Ҽ���� ����
//
//			for (int j = 2; j <= i / 2; j++) {
//				if (i % j == 0) { // �ϳ��� ������ �Ҽ��� �ƴϴ� �����.
//					isPrime = false;
//					break;
//				}
//
//			}
//			if (isPrime) {
//				System.out.print(i + "  ");
//			}
//		}

		// step4) 1���� 100 ������ ��� �Ҽ��� �� �ٿ� 5���� ����ϼ���.
		boolean isPrime; // ������ i ���� �Ҽ���� ����
		int count = 0;
		for (int i = 2; i <= 100; i++) {

			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) { // �ϳ��� ������ �Ҽ��� �ƴϴ� �����.
					isPrime = false;
					break;
				}

			}

			if (isPrime) {
				count++;
				System.out.printf("%3d  ", i);

				if (count % 5 == 0) {
					System.out.println();
				}
			}	
		}

	}
}