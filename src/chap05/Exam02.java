package chap05;

/*
	아래의 월의 마지막 일자 계산 프로그램을 배열을 이용하여
	보다 효율적인 코드로 변경하세요.
*/
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month;
		int[] monthLastDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 1. -1은 사용하지 않음을 의미하고 1~12월 순서를
																						// 맞춰준다.

		System.out.print("년도와 월을 입력하세요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			monthLastDays[2]=29;
		}
			System.out.printf("%d년 %d월의 마지막 일자는 %d일입니다.", year, month, monthLastDays[month]);
	}
}