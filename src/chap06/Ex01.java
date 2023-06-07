package chap06;

public class Ex01 {
	public static void main(String[] args) {
		String[] fruits = { "사과", "딸기", "바나나", "복숭아", "포도" };// 선언, 생성, 초기화를 한 번에

//		int[] lotto = new int[6];
//
//		lotto[0] = 7;
//		lotto[1] = 12;
//		lotto[2] = 19;
//		lotto[3] = 25;
//		lotto[4] = 33;
//		lotto[5] = 40;

//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}

//		for (int num : lotto) {
//			System.out.print(num + " ");
//		}

		// 향상된 for 문을 사용하여 모든 과일을 출력하는 코드를 작성하세요.
		for (String string : fruits) {
			System.out.print(string + " ");
		}

	}
}