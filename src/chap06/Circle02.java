package chap06;

public class Circle02 {

	static double pi = 3.141592;
	int radius;

	void setRadius(int rad) {
		radius = rad;
	}

	double getArea() {
		double area;
		area = radius * radius * pi;

		return area;
	}
}