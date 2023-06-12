package oop;

public class Child2 extends Parent {
	int num1;

	Child2() {
		num1 = 200;
	}

	void methodA() {
		System.out.println("Child methodA()");
	}

	void methodB() {
		System.out.println("Parent num1: "+super.num1);
		super.methodA();// 부모의 숨겨진 멤버를 사용하고 싶을 때 사용
	}
}
