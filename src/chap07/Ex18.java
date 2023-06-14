package chap07;

public class Ex18 {

	public static void main(String[] args) {

		Car[] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new FireEngine();
		cars[2] = new Ambulance();

		for (Car myCar : cars) {
			myCar.drive();
			// �ҹ����̸� ���� �Ѹ��� �������̸� ���̷��� �︮�� �ڵ带 �ۼ��ϼ���.
			if (myCar instanceof FireEngine) {
				FireEngine fire = (FireEngine) myCar;
				fire.water();
			}
			if (myCar instanceof Ambulance) {
				Ambulance ambulance = (Ambulance) myCar;
				ambulance.siren();
			}

			myCar.stop();

		}

	}
}
