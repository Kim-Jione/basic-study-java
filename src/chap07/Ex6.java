package chap07;

import chap07.package8.Child;

public class Ex6 {
	public static void main(String[] args) {
//		chap07.packageB.Child Ŭ������ �ν��Ͻ��� ��tjd��
//		result ���� ����ϴ� �ڵ带 �ۼ��ϼ���. ���� �������� �������
		Child child = new Child(10, 20, 30, 40);
		System.out.println("result: " + child.getResult());
	}

}
