package chap07;

public class Ex17 {

	public static void main(String[] args) {

		Car c1, c2, c3;
		c1 = new Car();
		c2 = new FireEngine();
		c3 = new Ambulance();
		FireEngine fire = new FireEngine(); // �ҹ����� ���� �ٲ�ٰ� �ٽ� �ҹ����� �ٲ� ����
		Ambulance ambulance = new Ambulance();

		System.out.println("c1 instanceof Car: " + (myCar instanceof Car));
		System.out.println("c1 instanceof FireEngine: " + (myCar instanceof FireEngine));
		System.out.println("c1 instanceof ambulance: " + (myCar instanceof Ambulance));

		System.out.println("c2 instanceof Car: " + (fire instanceof Car));
		System.out.println("c2 instanceof FireEngine: " + (fire instanceof FireEngine));
//		System.out.println("c2 instanceof ambulance: " + (fire instanceof Ambulance));

		System.out.println("c3 instanceof Car: " + (ambulance instanceof Car));
//		System.out.println("c3 instanceof FireEngine: " + (ambulance instanceof FireEngine));
		System.out.println("c3 instanceof ambulance: " + (ambulance instanceof Ambulance));

	
	}
}
