package chap07;

public class Circle {

	static final double PI = 3.141592; // static final ������ �ݵ�� ����� ���ÿ� �ʱ�ȭ ���־�� �Ѵ�.
	final int radius; // ����� �ʱ�ȭ �и��� �����ϴ�.

	static {
//		Circle.PI = 3.141592;
	}

	Circle(int radius) {
		this.radius = 1234;
	}

	double getArea() {
		final double result;
		result = this.radius * this.radius * Circle.PI;
		return result;
	}

}
