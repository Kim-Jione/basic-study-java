package chap03;

import java.util.Scanner;

/*
	[ ���� ��ȯ ���α׷� ]
	
	������ ���� ����� ���� ���α׷��� �ۼ��ϼ���.
	
	���� ���]
	
	����Ͻ� �ݾ��� �Է��ϼ���: 10000
	�����Ͻ� �ݾ��� �Է��ϼ���: 6234
	
	�Ž��� ��: 3766��
	500�� ¥�� ����: 7��
	100�� ¥�� ����: 2��
	50�� ¥�� ����: 1��
	10�� ¥�� ����: 1��
	������ �Ž�����: 6��
	
	�ڵ� �ۼ� ����]
	1. ���� ���� ������ �̿��Ͽ� ������ �ذ��մϴ�.
	2. �ϳ��� ������ ����Ͽ� ������ �ذ��մϴ�.
*/
public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("����Ͻ� �ݾ��� �˷��ּ���.");
		money = sc.nextInt();
		System.out.println("�����Ͻ� �ݾ��� �˷��ּ���.");
		money -= sc.nextInt(); // �Ž�����
		System.out.printf("\n500��¥�� ����: %d��", money/500);
		money %= 500;
		System.out.printf("\n100��¥�� ����: %d��", money/100);
		money %= 100;
		System.out.printf("\n50��¥�� ����: %d��", money/50);
		money %= 50;
		System.out.printf("\n10��¥�� ����: %d��", money/10);
		money %= 10;
		System.out.printf("\n������ ��: %d��", money);
		
				
				
				
				
				
				
				
				
				
				
				
				
				
//		Scanner sc = new Scanner(System.in);
//		int calculation, pay, remain;
//		System.out.print("����Ͻ� �ݾ��� �Է����ּ���.");
//		calculation = sc.nextInt();
//		System.out.print("�����Ͻ� �ݾ��� �Է����ּ���.");
//		pay = sc.nextInt();
//		remain = calculation - pay;
//
//		System.out.printf("�Ž��� ��: " + remain + "��" + "%n"); // 3766��
//		System.out.printf("500�� ¥�� ����: " + remain / 500 + "��" + "%n"); // 7��
//		remain = remain - (remain/500)*500;
//		System.out.printf("100�� ¥�� ����: " + remain / 100 + "��" + "%n");
//		remain = remain - (remain/100)*100;
//		System.out.printf("50�� ¥�� ����: " + remain / 50 + "��" + "%n");
//		remain = remain - (remain/50)*50;
//		System.out.printf("10�� ¥�� ����: " + remain / 10 + "��" + "%n");
//		remain = remain - (remain/10)*10;
//		System.out.printf("������ �Ž�����: " + remain  + "��");
		
//		Scanner sc = new Scanner(System.in);
//				int money;
//				System.out.print("\n\t����Ͻ� �ݾ��� �Է��ϼ���: ");
//				money = sc.nextInt();
//				
//				System.out.print("\t�����Ͻ� �ݾ��� �Է��ϼ���: ");
//				money -= sc.nextInt();
//				sc.close();
//				
//				System.out.printf("\n\t�Ž��� ��: %d��", money);
//				System.out.printf("\n\t500��¥�� ����: %d��", money/500);
//				
//				money %= 500; // �Ž��� ���� 500���� ���� �� �������� �ٽ� ����
//				System.out.printf("\n\t100��¥�� ����: %d��", money/100);
//				money %= 100; // �Ž��� ���� 500���� ���� �� �������� �ٽ� ����
//				System.out.printf("\n\t50��¥�� ����: %d��", money/50);
//				money %= 50; // �Ž��� ���� 500���� ���� �� �������� �ٽ� ����
//				System.out.printf("\n\t10��¥�� ����: %d��", money/10);
//				money %= 10; // �Ž��� ���� 500���� ���� �� �������� �ٽ� ����
//				System.out.printf("\n\t������ �Ž�����: %d��", money);
	}

}
