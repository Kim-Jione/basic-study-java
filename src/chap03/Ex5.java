package chap03;

public class Ex5 {

	public static void main(String[] args) {
		int a = 1000000, b = 2000000;
//		long c = a*b;//int x int�� int��. �׷��� int �ȿ��� ��ȯ�ϰ� �Ǿ� �־� ������ ���� ���´�.
		long c = (long)a*b;
		System.out.println("c: "+c);
	}	
}
