package chap06;

public class CircleTest01 {

	public static void main(String[] args) {
		Circle01 circle;
		circle = new Circle01();

		circle.pi = 3.141592;
		circle.setRadius(5);
		System.out.printf("�������� 5�� ���� ���̴� %.2f �Դϴ�.\n", circle.getArea());

		circle.setRadius(7);
		System.out.printf("�������� 5�� ���� ���̴� %.2f �Դϴ�.\n", circle.getArea());
	}

}
