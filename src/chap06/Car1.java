package chap06;

public class Car1 {
	String color;
	String gearType;
	int door;

	Car1() {
		this.color = "black";
		this.gearType = "auto";
		this.door = 4;
	}

	Car1(String color) {
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
	}

	Car1(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
		this.door = 4;
	}

	Car1(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
