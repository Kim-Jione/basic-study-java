package chap04;

/*
 2단부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.
 단, 하나의 for 반복문을 사용합니다.
 
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
		int dan = 2, num = 1;
		for (int i = 0; i < 72; i++) {// 횟수만 제어
			if (num == 1) {
				System.out.printf("\n [ %d 단 ]\n", dan);
			}
			System.out.printf("%d * %d = %2d\n", dan, num, dan);
			num++;
			if (num == 10) {
				dan++;
				num = 1;
			}
		}

	}
}