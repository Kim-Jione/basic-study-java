package chap06;

import java.util.Scanner;

public class ExamTest01 {

	/*
	 * ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���. ��, ��ü���������� �ڵ带 �ۼ��մϴ�.
	 * 
	 * ������1]
	 * 
	 * �ϳ��� �Ǽ��� �Է��ϼ���: 3.64
	 * 
	 * ���� : 3 �ݿø�: 4 �ø�: 4 ======================================= ������2]
	 * 
	 * �ϳ��� �Ǽ��� �Է��ϼ���: 6.2364
	 * 
	 * ���� : 6 �ݿø�: 6
	 * 
	 */

	public static void main(String[] args) {
		FloatToInteger floatToInteger = new FloatToInteger();
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("�ϳ��� �Ǽ��� �Է��ϼ���: ");
		num = sc.nextDouble();
		sc.close();
		floatToInteger.setNum(num);
		System.out.println("����: " + floatToInteger.floor());
		System.out.println("�ݿø�: " + floatToInteger.round());
		System.out.println("�ø�: " + floatToInteger.ceil());
	}

}