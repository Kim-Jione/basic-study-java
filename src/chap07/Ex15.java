package chap07;

public class Ex15 {

	public static void main(String[] args) {

//		Car myCar = new FireEngine();
//		myCar.drive();
//		myCar.stop();
//		myCar.water(); // 에러
		Car myCar = new FireEngine();
		FireEngine fire = (FireEngine)myCar; // 소방차를 차로 바꿨다가 다시 소방차로 바꾼 형식
		fire.water();
	
	}
}
