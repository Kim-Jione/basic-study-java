package chap03;

import java.util.Scanner;
/*
	����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
	
	������1]
	
	�ϳ��� �Ǽ��� �Է��ϼ���: 3.64
	
	���� : 3
	�ݿø�: 4
=======================================
	������2]
	
	�ϳ��� �Ǽ��� �Է��ϼ���: 6.2364
	
	���� : 6
	�ݿø�: 6

*/
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
	
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ��� >>> ");
		num = sc.nextDouble();
		System.out.printf("����: "+(int)num+"%n");
		System.out.printf("�ݿø�: "+(int)(num+0.5));
		
//		System.out.printf("�ݿø�: %.0f\n", num);
	}

}
