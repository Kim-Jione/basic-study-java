package oop;

public class Child4 extends Parent3 {
	int num2;

	Child4(int num1, int num2) { // �θ��� �Ű������� �ִ� �����ڸ� ȣ���ϴ� ��� -> super() �ڽ��� ������ �� �θ��� ����Ʈ �����ڸ� ȣ����
		super(num1); // ù��° �����̾�� �Ѵ�.
		this.num2 = 200;
		System.out.println("CHild3 Ŭ������ �ν��Ͻ� ����");
	}

}
