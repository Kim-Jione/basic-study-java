package chap06;

public class CircleTest03 {

	public static void main(String[] args) {
		Circle03 c1, c2;

		Circle03.setPi(3.14);
		c1 = new Circle03();
		c2 = new Circle03();

		c1.setRadius(5);
		c1.setRadius(7);

		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c1.radius, c1.getArea());
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c2.radius, c2.getArea());

		Circle03.setPi(3.141592);
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c1.radius, c1.getArea());
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다. \n", c2.radius, c2.getArea());
	}
}