package chap07;

public class Circle {

	static final double PI = 3.141592; // static final 변수는 반드시 선언과 동시에 초기화 해주어야 한다.
	final int radius; // 선언과 초기화 분리가 가능하다.

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
