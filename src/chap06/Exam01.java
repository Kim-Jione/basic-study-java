package chap06;

public class Exam01 {

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

	void ����(double �Ǽ�) {
		System.out.println("����: " + (int) �Ǽ�);
	}

	void �ݿø�(double �Ǽ�) {
		System.out.println("�ݿø�: " + (int) (�Ǽ� + 0.5));
	}

	void �ø�(double �Ǽ�) {
		System.out.println("�ø�: " + (int) (�Ǽ� + 1));
	}

	public static void main(String[] args) {
		double �Ǽ� = 3.64;
		Exam01 exam01 = new Exam01();
		exam01.����(�Ǽ�);
		exam01.�ݿø�(�Ǽ�);
		exam01.�ø�(�Ǽ�);
	}

}