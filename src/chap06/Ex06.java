package chap06;

public class Ex06 {

	void noReturn2() {
		System.out.println("ù ��° ����");
		System.out.println("�� ��° ����");
	}

	void return1() {
		System.out.println("return1() �޼��� ȣ��");
	}

	String return2() {
		System.out.println("return2() �޼��� ȣ��");
		return "ȣ����";
	}

	public static void main(String[] args) {
		// Ex05 ���� ����� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		Ex06 test = new Ex06();
		test.noReturn2();
		test.return1();
		test.return2();
		System.out.println("returnValue: " + test.return2());
	}

}