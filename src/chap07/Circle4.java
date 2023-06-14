package chap07;
public class Circle4{

	static Circle4 circle;
	static final double PI = 3.141592;
	private int radius;

	private Circle4(int radius) {
		this.setRadius(radius);
	}

	static Circle4 getCircle4(int radius) {
		if (Circle4.circle == null) {
			Circle4.circle = new Circle4(radius); // 기존 Circle4가 없을시 반지름 넣고 생성
		} else {
			Circle4.circle.setRadius(radius); // Circle4 존재시 반지름 수정
		}
		return Circle4.circle;
	}

	void setRadius(int radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 1;
		}
	}

	int getRadius() {
		return this.radius;
	}

	double getCircumference() {
		return this.radius * 2 * Circle4.PI;
	}

	double getArea() {
		return this.radius * this.radius * Circle4.PI;
	}
}