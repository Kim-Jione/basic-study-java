package chap06;

public class Ex08 {

	void changeParam(int num) {
		num *= 2;
		System.out.println("[chaneParam()] num: " + num);
	}

	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		int num = 1234;
		System.out.println("[�޼��� ȣ�� ��] num: " + num);

		// chanegeParam() �޼��� ȣ��
		ex08.changeParam(num);
		System.out.println("[�޼��� ȣ�� ��] num: " + num);
	}

}