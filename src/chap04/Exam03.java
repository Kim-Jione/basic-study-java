package chap04;

/*
[ ���� ��� ���α׷� ]

����ڿ��� �⵵�� �Է� �޾� ���� ���θ� �Ǵ��Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ���.

[���� ���1]					[���� ���2]
�⵵�� �Է��ϼ���: 2023			�⵵�� �Է��ϼ���: 2020
�Է��Ͻ� �⵵�� ����Դϴ�.			�Է��Ͻ� �⵵�� �����Դϴ�.
==========================================================
[���� �Ǵ� �˰���]
1. 4�� ����� �ش� �����Դϴ�.
2. 100�� ����� �ش� ����Դϴ�.
3.400�� ����� �ش� �����Դϴ�.

- �ּ� 4���� �⵵�� �׽�Ʈ �ؾ� �մϴ�.
- 2023: ���, 2020: ����, 1900: ���, 2000: ����
==========================================================
[�ڵ� �ۼ� ����]
1. if...else if...else ������ �̿��Ͽ� ������ �ذ��ϼ���.
2. if...else ������ �̿��Ͽ� ������ �ذ��ϼ���.

 */
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���: ");
		double year = sc.nextDouble();

//		if (year / 4 == (int) year / 4 && year / 100 != (int) year / 100 ) {
//			System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�.");
//		} else if (year / 100 == (int) year / 100 && year / 400 != (int) year / 400) {
//			System.out.println("�Է��Ͻ� �⵵�� ����Դϴ�.");
//		} else if (year / 400 == (int) year / 400) {
//			System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�.");
//		}else {
//			System.out.println("�Է��Ͻ� �⵵�� ����Դϴ�.");
//		}
		
		if (year / 4 == (int) year / 4 && year / 100 != (int) year / 100 || year / 400 == (int) year / 400 ) {
			System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� �⵵�� ����Դϴ�.");
		}
	}
}