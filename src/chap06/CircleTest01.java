package chap06;

public class CircleTest01 {

	public static void main(String[] args) {
		Circle01 circle;
		circle = new Circle01();

		circle.pi = 3.141592;
		circle.setRadius(5);
		System.out.printf("반지름이 5인 원의 넓이는 %.2f 입니다.\n", circle.getArea());

		circle.setRadius(7);
		System.out.printf("반지름이 5인 원의 넓이는 %.2f 입니다.\n", circle.getArea());
	}

}
