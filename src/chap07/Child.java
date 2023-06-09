package chap07;

public class Child extends Parent {
	Child() {
		System.out.println("Child 인스턴스 생성");

	}

	void methodA() {
		super.methodA();
		System.out.println("Child 클래스 methodA()");
	}
}
