package oop;

public class Test13 {
	public static void main(String[] args) {
		Child4 child4 = new Child4(123, 456);
		System.out.println("num1: " + child4.num1);
		System.out.println("num2: " + child4.num2);

		/* 출력결과
		 * Parent 클래스의 인스턴스 생성 
		 * CHild3 클래스의 인스턴스 생성 
		 * num1: 123 
		 * num2: 200
		 */

	}
}
