package chap07;

public class Child extends Parent {
	Child() {
		System.out.println("Child �ν��Ͻ� ����");

	}

	void methodA() {
		super.methodA();
		System.out.println("Child Ŭ���� methodA()");
	}
}
