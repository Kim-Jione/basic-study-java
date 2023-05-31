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
		int year, month, monthLastDay = 31;
		System.out.println("년도를 월을 입력하세요.: ");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			monthLastDay = 30;
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
				monthLastDay = 29;
			} else {
				monthLastDay = 28;
			}
			break;
		}
		System.out.printf("%d년 %d월의 마지막 일자는 %d일 입니다.", year, month, monthLastDay);
	}
}