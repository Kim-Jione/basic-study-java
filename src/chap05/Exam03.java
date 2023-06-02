package chap05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year, month, day, count = 0;
		int[] monthLastDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.print("년, 월, 일을 입력하세요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();

		// 년도 일수 구하기
		for (int i = 1; i <= year - 1; i++) {

			// 윤년,평년 계산 알고리즘
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				// 윤년
				count += 366;
			} else {
				// 평년
				count += 365;
			}
		}
		//

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			monthLastDays[2] = 29;
		}

		// 월 일수 구하기 전
		for (int i = 1; i < month; i++) {
			count += monthLastDays[i];
		}

		// 일수 구하기
		count += day;

		// 요일 구하기
		count %= 7;
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n", year, month, day, days[count]);

	}

}