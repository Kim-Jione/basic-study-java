package chap06;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle;
		circle = new Circle();

		circle.setRadius(5);
		System.out.printf("반지름이 5인 원의 넓이는 %.2f 입니다.\n", circle.getArea());
		
		circle.setRadius(7);
		System.out.printf("반지름이 5인 원의 넓이는 %.2f 입니다.\n", circle.getArea());
	}

}
