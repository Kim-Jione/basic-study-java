package chap04;

/*
	 2단부터 9단 까지의 전체 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요.
	 단, 중첩 반복문을 사용하세요.
	 

*/

public class Gugudan07 {

	public static void main(String[] args) {
		int dan, num;

		for (num = 0; num <= 9; num++) {// 열

			for (dan = 2; dan <= 9; dan++) {// 행

				if (num == 0) {
					System.out.printf(" [ %d 단 ]\t", dan);

				} else {
					System.out.printf("%d * %d = %2d\t", dan, num, dan * num);

				}
			}
			System.out.println();
		}

	}
}
