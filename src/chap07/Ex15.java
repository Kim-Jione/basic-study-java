package chap07;

public class Ex15 {

	public static void main(String[] args) {

//		Car myCar = new FireEngine();
//		myCar.drive();
//		myCar.stop();
//		myCar.water(); // ����
		Car myCar = new FireEngine();
		FireEngine fire = (FireEngine)myCar; // �ҹ����� ���� �ٲ�ٰ� �ٽ� �ҹ����� �ٲ� ����
		fire.water();
	
	}
}
