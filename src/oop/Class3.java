package oop;

public class Class3 {
	int instanceVar = 5678; // 0(�ڵ� �ʱ�ȭ)
	static int classVar = 1234; // 0(�ڵ� �ʱ�ȭ)

	void instanceMethodA() {
		System.out.println("instanceMethodA()");
	}

	void instanceMethodB() {
		System.out.println("classVar: " + classVar);
		Class3.classMethodA();
		System.out.println("instanceVar: " + this.instanceVar);
		this.instanceMethodA();
	}

	static void classMethodA() {
		System.out.println("classMethodA()");
	}

	static void classMethodB() {
		System.out.println("classVar: " + classVar);
	}

}
