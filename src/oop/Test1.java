package oop;

public class Test1 {
	public static void main(String[] args) {
		Class1 class1; // 1.
		class1 = new Class1(); // 2. 인스턴스 생성

		System.out.println("num: " + class1.num); // 1. 변수들은 자동 초기화된다.
		class1.methodA();

		class1.num = 1234;
		System.out.println("num: " + class1.num);// 

	}
}
