package chap07;

public class Ex17 {

	public static void main(String[] args) {

		Car c1, c2, c3;
		c1 = new Car();
		c2 = new FireEngine();
		c3 = new Ambulance();
		FireEngine fire = new FireEngine(); // 소방차를 차로 바꿨다가 다시 소방차로 바꾼 형식
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
