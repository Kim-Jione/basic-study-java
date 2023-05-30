package chap04;

/*
 사용자에게 구구단의 단을 입력 받아 구구단 결과를 출력하는 코드를 작성하세요.
 
 실행 예]
 구구단의 단을 입력하세요: 4
 
  [ 4 단 ]
 4 * 1 =  4
 4 * 2 =  8
 4 * 3 = 12
 . . .
 4 * 9 = 36
*/
import java.util.Scanner;

public class Gugudan01 {

	public static void main(String[] args) {
		int dan, total;

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 단을 입력하세요: ");
		dan = sc.nextInt();
		sc.close();
		System.out.printf("\n  [ %d 단 ]", dan);
		

		for (int num = 1; num <= 9; num++) {
			total = dan * num;
			System.out.printf("\n %d * %d = %2d", dan, num, total);
		}

	}
}