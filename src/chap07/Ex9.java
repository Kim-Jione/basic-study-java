package chap07;

public class Ex9 {
	public static void main(String[] args) {
		Circle4 c1, c2, c3, c4; // ��� �ϳ���
		c1 = Circle4.getCircle4(3);
		System.out.println("area: " + c1.getArea());
		System.out.println("circumference: " + c1.getCircumference());

		c2 = Circle4.getCircle4(4);
		System.out.println("area: " + c1.getArea());
		System.out.println("circumference: " + c1.getCircumference());
		
		c3 = Circle4.getCircle4(5);
		System.out.println("area: " + c1.getArea());
		System.out.println("circumference: " + c1.getCircumference());

		c4 = Circle4.getCircle4(6);
		System.out.println("area: " + c1.getArea());
		System.out.println("circumference: " + c1.getCircumference());
		
		System.out.println("=====================");
		System.out.println("c1 == c2 : "+ (c1==c2)); // ���۷��� �ּҰ� ��
		System.out.println("c2 == c3 : "+ (c2==c3)); // ���۷��� �ּҰ� ��
		System.out.println("c3 == c4 : "+ (c3==c4)); // ���۷��� �ּҰ� ��
	}

}
