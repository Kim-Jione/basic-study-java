package chap07;

public final class Child2 extends Parent2{
	String gender;
	Child2(String name, String gender){
		super(name);
		this.gender = gender;
		System.out.println("Child �ν��Ͻ� ����");
	}
	void methodA() {
		System.out.println("Child Ŭ���� methodA()");
	}
}
