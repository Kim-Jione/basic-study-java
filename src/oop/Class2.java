package oop;

public class Class2 {
	int instanceVar; // 0(�ڵ� �ʱ�ȭ)
	static int classVar; // 0(�ڵ� �ʱ�ȭ)

	void methodA() {
		int methodVar;
		methodVar = 10;// �޼��� ������ �ʱ�ȭ�� �ڵ����� ���� �ʾ� ���� �����ؾ� �Ѵ�.
		System.out.println("methodVar: " + methodVar);
	}
}
