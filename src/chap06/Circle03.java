package chap06;

public class Circle03 {

	static double pi;
	double radius;

	static void setPi(double pi) {
		Circle03.pi = pi;
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