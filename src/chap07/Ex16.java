package chap07;

public class Ex16 {

	public static void main(String[] args) {

		Car myCar = new Car();
		FireEngine fire = new FireEngine(); // 소방차를 차로 바꿨다가 다시 소방차로 바꾼 형식
		Ambulance ambulance = new Ambulance();

		System.out.println("myCar instanceof Car: " + (myCar instanceof Car));
		System.out.println("myCar instanceof FireEngine: " + (myCar instanceof FireEngine));
		System.out.println("myCar instanceof ambulance: " + (myCar instanceof Ambulance));

		System.out.println("fire instanceof Car: " + (fire instanceof Car));
		System.out.println("fire instanceof FireEngine: " + (fire instanceof FireEngine));
//		System.out.println("fire instanceof ambulance: " + (fire instanceof Ambulance));

		System.out.println("ambulance instanceof Car: " + (ambulance instanceof Car));
//		System.out.println("ambulance instanceof FireEngine: " + (ambulance instanceof FireEngine));
		System.out.println("ambulance instanceof ambulance: " + (ambulance instanceof Ambulance));

		/*
		 * myCar instanceof Car: true 
		 * myCar instanceof FireEngine: false 
		 * myCar instanceof ambulance: false 
		 * fire instanceof Car: true 
		 * fire instanceof FireEngine: true 
		 * fire instanceof ambulance: 컴파일 에러 
		 * ambulance instanceof Car: true 
		 * ambulance instanceof ambulance: true
		 * ambulance instanceof fire: 컴파일 에러
		 */
	}
}
