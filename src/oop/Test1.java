package oop;

public class Test1 {
	public static void main(String[] args) {
		Class1 class1; // 1.
		class1 = new Class1(); // 2. �ν��Ͻ� ����

		System.out.println("num: " + class1.num); // 1. �������� �ڵ� �ʱ�ȭ�ȴ�.
		class1.methodA();

		class1.num = 1234;
		System.out.println("num: " + class1.num);// 

	}
}
