package chap03;

import java.util.Scanner;

// 1. ����ڿ��� ����� ���� ������ �Է����� �޾� �� ���� ��� 80�� �̻��̸� "�հ��Դϴ�.", �ƴϸ� "���հ��Դϴ�." ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
// 2. ����ڿ��� ����� ���� ������ �Է����� �޾� �� ���� �� �� �����̶� 80�� �̸��� ������ ������ "������ ������ ���� �մϴ�.", 
// �ƴϸ� "������ ������ �����ϴ�." ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
// 3. ����ڿ��� ����� ���� ������ �Է����� �޾� �� ���� ��� 80�� �̻��̸� "�հ��Դϴ�.", �ƴϸ� "���հ��Դϴ�." ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
// ��, AND �����ڴ� ����� �� �����ϴ�.
public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng, math;
		boolean result;
		
		System.out.print("����� ���� ������ �Է��ϼ��� >>> ");
		eng = sc.nextInt();
		math = sc.nextInt();
		
//		result = eng >= 80 && math >= 80;
//		System.out.println("exam1] "+(result?"�հ��Դϴ�.":"���հ��Դϴ�."));
//
//		result = eng < 80 || math < 80;
//		System.out.println("exam2] " + (result?"������ ������ ���� �մϴ�.":"������ ������ �����ϴ�."));
//
		result = !(eng < 80 || math < 80);
		System.out.println("exam3] " + (result?"�հ��Դϴ�.":"���հ��Դϴ�."));
	}

}
