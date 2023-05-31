package chap04;

public class Ex08 {

	public static void main(String[] args) {
		// 아래의 중첩 for 반복문을 중첩 while 반복문으로 변환하는 코드를 작성하세요.
//		int dan, num;
//
//		for (num = 0; num <= 9; num++) {// 열
//
//			for (dan = 2; dan <= 9; dan++) {// 행
//
//				if (num == 0) {
//					System.out.printf(" [ %d 단 ]\t", dan);
//
//				} else {
//					System.out.printf("%d * %d = %2d\t", dan, num, dan * num);
//
//				}
//			}
//			System.out.println();
//		}

		int num = 0;
		while (num <= 9) {
			int dan = 2;// 자기 자신 반복문 바로 위로 올려야 한다.
			while (dan <= 9) {
				if (num == 0) {
					System.out.printf(" [ %d 단 ]\t", dan);
				} else {
					System.out.printf("%d * %d = %2d\t", dan, num, dan * num);
				}
				dan++;
			}
		}
		System.out.println();
		num++;
	}
}