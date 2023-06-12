package chap07;

class Parent {

	String name;

	Parent(String name) {
		this.name = name;
		System.out.println("Parent �ν��Ͻ� ����");

	}

	void methodA() {
		System.out.println("Parent Ŭ���� methodA()");
	}
}

class Child extends Parent {
	String gender;

	Child(String name, String gender) {
		super(name);
		this.gender = gender;
		System.out.println("Child �ν��Ͻ� ����");

	}

	void methodA() {
		super.methodA();
		System.out.println("Child Ŭ���� methodA()");
	}
}

public class Ex4 {
	public static void main(String[] args) {
		Child child = new Child("�����", "����");
		child.methodA();
		System.out.println(child.name + " : " + child.gender);
	}
}
