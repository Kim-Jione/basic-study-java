package chap06;

public class ReturnTest {

	void noReturn1() {
		System.out.println("ù ��° ����");
		System.out.println("�� ��° ����");
		System.out.println("�� ��° ����");
	}

	void noReturn2() {
		System.out.println("ù ��° ����");
		System.out.println("�� ��° ����");
		return; // �޼��� ���� �����ϱ� ����
//		System.out.println("�� ��° ����"); // �޼���� ����Ʊ⿡ ����
	}

	void return1() {
		System.out.println("return1() �޼��� ȣ��");

	}

	String return2() {
		System.out.println("return2() �޼��� ȣ��");
		return "ȣ����";
	}

}