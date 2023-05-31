package chap04;

/*
 * 1 부터 100 사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하세요.
 * 
 *	  [ 실행 예]
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

		// step1) 1과 자신을 제외한 20의 모든 약수를 출력하세요.

//		for (int i = 2; i <= 20 / 2; i++) {
//			if (20 % i == 0) {
//				System.out.print(i + " ");
//			}
//		}

		// step2) 1과 자신을 제외한 2부터 20까지의 모든 수에 대한 약수를 구하여 출력하세요.
//		for (int i = 2; i <= 20 / 2; i++) {
//			System.out.printf("%d의 약수: ", i);
//
//			for (int j = 2; j <= i / 2; j++) {
//			if (i % j == 0) {
//				System.out.print(j + " ");
//			}
//		}
//			System.out.println();
//		}

		// step3) 1부터 100 사이의 모든 소수를 구하여 출력하세요.

//		for (int i = 2; i <= 100 ; i++) {
//			boolean isPrime = true; // 각각의 i 값은 소수라고 가정
//
//			for (int j = 2; j <= i / 2; j++) {
//				if (i % j == 0) { // 하나라도 나오면 소수가 아니니 멈춘다.
//					isPrime = false;
//					break;
//				}
//
//			}
//			if (isPrime) {
//				System.out.print(i + "  ");
//			}
//		}

		// step4) 1부터 100 사이의 모든 소수를 한 줄에 5개씩 출력하세요.
		boolean isPrime; // 각각의 i 값은 소수라고 가정
		int count = 0;
		for (int i = 2; i <= 100; i++) {

			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) { // 하나라도 나오면 소수가 아니니 멈춘다.
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