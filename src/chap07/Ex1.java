package chap07;

public class Ex1 {
	public static void main(String[] args) {
		ClassB classB = new ClassB();

		// num1, num2, method2(), method2() ����� ���� ����� Ȯ���ϼ���.
		System.out.println("num1: " + classB.classA.num1);
		System.out.println("num2: " + classB.num2);
		System.out.println("method1: " + classB.classA.method1());
		System.out.println("method2: " + classB.method2());
	}
}
