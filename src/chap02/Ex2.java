package chap02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {// ��ĳ�ʸ� ����ϸ� Ű��������κ��� �Է¹��� ���� Ȱ���� �� �ִ�.
		String student_name;
		int math_score;
		Scanner sc = new Scanner(System.in);// �Է¹��� ���ڿ���

		System.out.print("�л� �̸��� �Է��ϼ���.");
		student_name = sc.next();// ����ڰ� ������ �Է��� ������ ����Ѵ�.
		
		System.out.print("���� ������ �Է��ϼ���.");
		Scanner sc2 = new Scanner(System.in);// �Է¹��� ������
		math_score = sc.nextInt();// ����ڰ� ������ �Է��� ������ ����Ѵ�.
		
		System.out.println("�л� �̸�: " + student_name);
		System.out.println("���� ����: " + math_score);
		// println�� �Ʒ����� ����ϰ� �����Ѵ�. print�� ���ุ �Ѵ�.
		sc.close();
	}
}
