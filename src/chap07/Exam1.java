package chap07;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyCalendar calendar;
		int year, month, day;

		System.out.println("��, ��, ���� �Է��ϼ���: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		
		calendar = new MyCalendar(year,month,day);
		System.out.printf("�Է��Ͻ� %d�� %d�� %d���� %s�����Դϴ�. \n", year, month, day, calendar.getDayOfWeek());
	}
}
