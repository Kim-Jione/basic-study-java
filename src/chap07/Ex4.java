package chap07;

class Parent {

	String name;

	Parent(String name) {
		this.name = name;
		System.out.println("Parent 인스턴스 생성");

	}

	void methodA() {
		System.out.println("Parent 클래스 methodA()");
	}
}

class Child extends Parent {
	String gender;

	Child(String name, String gender) {
		super(name);
		this.gender = gender;
		System.out.println("Child 인스턴스 생성");

	}

	void methodA() {
		super.methodA();
		System.out.println("Child 클래스 methodA()");
	}
}

public class Ex4 {
	public static void main(String[] args) {
		Child child = new Child("손흥민", "남자");
		child.methodA();
		System.out.println(child.name + " : " + child.gender);
	}
}
