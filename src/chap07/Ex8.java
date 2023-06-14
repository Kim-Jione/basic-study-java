package chap07;

public class Ex8 {
	public static void main(String[] args) {
		Circle3 circle = null;
		try {
			circle = new Circle3(5);
			System.out.println("area: " + circle.getArea());
			System.out.println("circumference: " + circle.getCircumference());
			
			circle = new Circle3(-5);
			System.out.println("area: " + circle.getArea());
			System.out.println("circumference: " + circle.getCircumference());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
