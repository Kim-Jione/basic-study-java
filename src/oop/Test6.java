package oop;

public class Test6 {
	void callByValue(int num) {
		num *= 2;
		System.out.println("callByValue() num: " + num);
	}

	public static void main(String[] args) {
		int num = 4;
		Test6 test6 = new Test6();

		// callByValue(num) �� ȣ���ϴ� ������ �ۼ��ϼ���.
		System.out.println("[callByValue() �޼��� ȣ�� ��] num: " + num);
		test6.callByValue(num);
		System.out.println("[callByValue() �޼��� ȣ�� ��] num: " + num);
	}

}
