package chap06;

public class Circle04 {
//	static double pi=3.14;
	static double pi;
	double radius;

	static {// �ʱ�ȭ ���, �� ���� �ʱ�ȭ�ȴ�.
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