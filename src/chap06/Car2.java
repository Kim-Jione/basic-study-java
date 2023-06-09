package chap06;

public class Car2 {
	String color;
	String gearType;
	int door;

	Car2() {
		this("black", "auto", 4);// 자기 클래스 안에 있는 다른 생성자 호출, 4번째 생성자에게 역할을 넘김
		// 코드의 중복을 줄이기 위해 생성자 안에서 다른 생성자를 호출할 수 있어야 한다.
		// this는 첫 번째	 문자이어야 한다.
		System.out.println("첫 번째 생성자");
	}

	Car2(String color) {
		this(color, "auto", 4);
		System.out.println("두 번째 생성자");
	}

	Car2(String color, String gearType) {
		this(color, gearType, 4);
		System.out.println("세 번째 생성자");
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("네 번째 생성자");
	}
	
//	Car2(Car2 car2){
//		this.color = car2.color;
//		this.gearType = car2.gearType;
//		this.door = car2.door;
//		
//	}

}
