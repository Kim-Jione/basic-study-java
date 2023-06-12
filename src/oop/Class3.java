package oop;

public class Class3 {
	static int classVar = 1234; // 0(자동 초기화)
	int instanceVar = 5678; // 0(자동 초기화)

	static void classMethodA() {
		System.out.println("classMethodA()");
	}

	static void classMethodB() {
		System.out.println("classVar: " + classVar);
	}

	void instanceMethodA() {
		System.out.println("instanceMethodA()");
	}

	void instanceMethodB() {
		System.out.println("classVar: " + classVar);
		Class3.classMethodA();
		System.out.println("instanceVar: " + this.instanceVar);
		this.instanceMethodA();
	}
}
