package chap07;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyCalendar calendar;
		int year, month, day;

		System.out.println("년, 월, 일을 입력하세요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		
		calendar = new MyCalendar(year,month,day);
		System.out.printf("입력하신 %d년 %d월 %d일은 %s요일입니다. \n", year, month, day, calendar.getDayOfWeek());
	}
}
