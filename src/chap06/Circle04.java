package chap06;

public class Circle04 {
//	static double pi=3.14;
	static double pi;
	double radius;

	static {// 초기화 블록, 한 번만 초기화된다.
		Circle04.pi = 3.141592;
	}

	Circle04() {
//		Circle04.pi=3.141592;
	}

	static void setPi(double pi) {
		Circle04.pi = pi;
	}

	void setRadius(int rad) {
		radius = rad;
	}

	double getArea() {
		double area;
		area = radius * radius * pi;
		return area;
	}
}