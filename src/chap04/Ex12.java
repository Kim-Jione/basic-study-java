package chap04;

public class Ex12 {

	public static void main(String[] args) {
		// 1 부터 100 사이의 짝수의 합을 구하는 코드를 작성하세요.
		// 단, continue 를 사용합니다.
		int total = 0;

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			total += i;
//		}
//		System.out.println("total: " + total);
		int i = 1;
		while (i <= 100) {

			if (i % 2 != 0) {
				i++;// 뒤에 미지수 증가도 건너 뛰어서 미리 해줘야 한다.
				continue;// wihle 문에서 continue를 쓸 때 continue 뒤에 미지수를 변경하는 코드를 둬서는 안된다. 
			}
			total += i;
			i++;

		}
		System.out.println("total: " + total);
	}
}