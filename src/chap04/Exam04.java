package chap04;

/*
[ 윤년 계산 프로그램 ]

사용자에게 년도를 입력 받아 해당 월의 마지막 일자를 출력하는 코드를 작성하세요.

[실행 예1]						[실행 예2]
년도를 월을 입력하세요: 2023 1			년도를 월을 입력하세요: 2020 2
2023년 1월의 마지막 일자는 31일입니다.	2020년 2월의 마지막 일자는 29일입니다.
==========================================================
[각 월의 마지막 일자 판단 알고리즘]
1. 큰달: 1, 3, 5, 7, 8, 10, 12 => 31일
2. 작은달: 4, 6, 9, 11 => 30일
3. 2월: 윤년 => 29일, 평년 => 28일
 */

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 월을 입력하세요.: ");
		int year = sc.nextInt();
		int month = sc.nextInt();

		if (month == 2) {
			if (year / 4 == (int) year / 4 && year / 100 != (int) year / 100 || year / 400 == (int) year / 400) {

				System.out.printf("%d년 %d월의 마지막 일자는 29일입니다.", year, month);
			} else {
				System.out.printf("%d년 %d월의 마지막 일자는 28일입니다.", year, month);

			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.printf("%d년 %d월의 마지막 일자는 31일입니다.", year, month);
		} else {
			System.out.printf("%d년 %d월의 마지막 일자는 30일입니다.", year, month);
		}
	}
}