package chap06;

public class Ex07 {// 독립적인 메서드는 존재해서는 안된다.

	// 프로그램의 제목을 출력하는 메서드
	void printTitle() {
		System.out.println("\t 원의 넓이 계산 프로그램");
	}

	// 입력으로 주어진 문자를 count 만큼 출력하는 메서드
	void printCharacter(char ch, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	// PI 값을 반환하는 메서드
	double getPi() {
		double pi = 3.141592;
		return pi;
	}

	// 반지름을 입력으로 받아 원의 넓이를 계산하여 반환하는 메서드
	double getCircleArea(int radius) {
		double result;
		result = radius * radius * getPi();
		return result;
	}

	public static void main(String[] args) {
		Ex07 ex07 = new Ex07();
		int radius = 7;
		ex07.printCharacter('*', 35);
		ex07.printTitle();
		ex07.printCharacter('*', 35);
		System.out.printf("반지름이 %d인 원의 넓이는 %f입니다. \n", radius, ex07.getCircleArea(radius));

	}

}