package chap07;

import chap02.Ex2;

public class Ex22 implements YourInterface {
	public void abstractMethod() {
		System.out.println("abstractMethod()");
	}

	public static void main(String[] args) {
//		Ex22 ex22 = new Ex22();
		YourInterface your = new Ex22();

//		System.out.println("num: " + ex22.num); // ������: num: 1234
		System.out.println("num: " + YourInterface.num); // ������: num: 1234 ���� �ڵ�� �����ϴ� ���� �����Ѵ�.
		System.out.println("num: " + your.num); // ������: num: 1234 ���� �ڵ�� �����ϴ� ���� �����Ѵ�.

//		ex22.staticMethod(); // ���� �߻�, staticMethod �޼���� ���۷����� ������ �� ����.
		YourInterface.staticMethod(); // ������: staticMethod() staticMethod �޼���� �������̽������� �����ؾ� �Ѵ�.
		
//		ex22.defaultMethod(); // ������: defaultMethod()
		your.defaultMethod(); // ������: defaultMethod()
		
//		ex22.abstractMethod(); // ������: abstractMethod()
		your.abstractMethod(); // ������: abstractMethod()
	}
}
