package chap06;

public class Ex05 {

	public static void main(String[] args) {
		ReturnTest test = new ReturnTest(); // �ν��Ͻ��� �����Ǿ����� ��밡��
		// noReturn() �޼��带 ȣ���Ͽ� �����ϴ� �ڵ带 �ۼ��ϼ���.
//		test.noReturn1();
		test.noReturn2();
		test.return1();
		test.return2();// ���� ��ȯ�ϴ� ȣ�⹮�� ���ڿ� "ȣ����"�� �ٲ��.
		String returnValue = test.return2();
		System.out.println("returnValue: " + returnValue);
	}

}