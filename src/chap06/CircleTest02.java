package chap06;

public class CircleTest02 {

	public static void main(String[] args) {
		Circle01 c1, c2;
		c1 = new Circle01();
		c2 = new Circle01();
		System.out.println("c1] pi: " + c1.pi + ", radius: " + c1.radius);
		System.out.println("c2] pi: " + c2.pi + ", radius: " + c2.radius);

		// c1.radius=5;
		c1.setRadius(5);
		c1.pi = 3.141592;
		System.out.println("c1] pi: " + c1.pi + ", radius: " + c1.radius + ", area: " + c1.getArea());

		c2.setRadius(7);
		c2.pi = 3.141592;
		System.out.println("c2] pi: " + c2.pi + ", radius: " + c2.radius + ", area: " + c2.getArea());
	}

}
