package chap06;

public class Ex05 {

	void noReturn() {
		System.out.println("ù ��° ����");
		System.out.println("�� ��° ����");
		System.out.println("�� ��° ����");
	}

	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		// noReturn() �޼��带 ȣ���Ͽ� �����ϴ� �ڵ带 �ۼ��ϼ���.
		ex05.noReturn();
	}

}