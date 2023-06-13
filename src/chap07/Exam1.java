package chap07;

import java.util.Scanner;

class Count {
	int count;
	int[] monthLastDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	int count(int year, int month, int day) {
		// �⵵ �ϼ� ���ϱ�
		for (int i = 1; i <= year - 1; i++) {

			// ����,��� ��� �˰���
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				// ����
				count += 366;
			} else {
				// ���
				count += 365;
			}
		}
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			monthLastDays[2] = 29;
		} // �� �ϼ� ���ϱ� ��
		for (int i = 1; i < month; i++) {
			count += monthLastDays[i];
		}

		// �ϼ� ���ϱ�
		count += day;

		// ���� ���ϱ�
		return count %= 7;
	}

}

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, day, count;
		int[] monthLastDays = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] days = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.print("��, ��, ���� �Է��ϼ���: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		Count ���� = new Count();
		count = ����.count(year, month, day);
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.\n", year, month, day, days[count]);

	}
}
