package chap02;

import java.util.*;    // Scanner�� ����ϱ� ���� �߰�

class ScannerEx2 { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int math, eng;
		
		System.out.print("����, ���� ������ �Է��� �ּ���: ");
		math = scanner.nextInt();
		eng = scanner.nextInt();
		System.out.printf("��������: %d, ��������: %d",math, eng);
		
		scanner.close();
		
//		String input = scanner.nextLine();//����ڰ� ���� �Է��� ������ �ϳ��� ���ڿ��� �ν�
//		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
//
//		System.out.println("�Է³��� :"+input);
//		System.out.printf("num=%d%n", num);
	} 
}
