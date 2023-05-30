package chap04;

/*
 2단부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.
 단, 중첩 반복문을 사용하세요.
 
 실행 예]
 [ 2 단 ]
 2 * 1 =  2
 2 * 2 =  4
 2 * 3 =  6
 . . .
 2 * 9 = 18
 
  [ 3 단 ]
 3 * 1 =  3
 . . .
 4 * 9 = 36
 

*/

public class Gugudan03 {

	public static void main(String[] args) {
		int dan, num;
		for (dan = 2; dan <= 9; dan++) {
			if (dan == 2) {
				System.out.printf("  [ %d 단 ]", dan);
			} else {
				System.out.printf("\n\n  [ %d 단 ]", dan);

			}
			for (num = 1; num <= 9; num++) {
				System.out.printf("\n %d * %d = %2d", dan, num, dan * num);
			}
		}

	}
}