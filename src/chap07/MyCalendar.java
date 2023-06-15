package chap07;

public class MyCalendar {
	private int year;
	private int month;
	private int day;

	public MyCalendar(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// ���� ���� �Ǵ� �޼���
	private boolean isLeapYear() {
		return this.isLeapYear(this.year);
	}

	boolean isLeapYear(int year) {
		boolean result = false;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			result = true;
		}
		return result;
	}

	// �� ���� ������ ���ڸ� ��ȯ�ϴ� �޼���
	private int getMonthLastDay(int month) {
		int[] monthLastDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (this.isLeapYear()) {
			monthLastDays[2] = 29;
		}
		return monthLastDays[month];
	}

	// ���� 1�� 1�� 1�� ���� ����ڰ� �Է��� ��¥ ������ ��ü �� �ϼ� ��ȯ
	private int getTotalDays() {
		int totalDays = 0;

		for (int i = 1; i < this.year; i++) {
			if (this.isLeapYear(i)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}

		for (int i = 1; i < this.month; i++) {
			totalDays += this.getMonthLastDay(i);
		}
		totalDays += this.day;

		return totalDays;
	}

	// ������ ��ȯ�ϴ� �޼���
	public String getDayOfWeek() {
		String[] dayOfWeek = { "��", "��", "ȭ", "��", "��", "��", "��" };
		return dayOfWeek[this.getTotalDays() % 7];
	}
}
