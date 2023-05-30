package chap04;

/*
	 2단부터 9단 까지의 전체 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요.
	 단, 중첩 반복문을 사용하세요.
	 
	 			if (dan == 2) {
				System.out.printf("  [ %d 단 ]", dan);
			} else {
				System.out.printf("\n\n  [ %d 단 ]", dan);

			}
*/

public class Gugudan06 {

	public static void main(String[] args) {
		int dan, num;

		for (num = 1; num <= 9; num++) {
			for (dan = 2; dan <= 9; dan++) {
				if(dan==9) {
					System.out.printf("%d * %d = %2d      \n", dan, num, dan * num);
					
				}else {
					System.out.printf("%d * %d = %2d      ", dan, num, dan * num);
					
				}
			}
		}

	}
}