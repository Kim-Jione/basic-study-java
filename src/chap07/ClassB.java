package chap07;

public class ClassB {
	int num2;
	ClassA classA;

	ClassB() {
		this.num2 = 10;
		classA = new ClassA();
	}

	String method2() {
		return "ClassA Ŭ������ method1() �Դϴ�.";
	}
}
