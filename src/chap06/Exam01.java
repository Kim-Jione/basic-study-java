package chap06;

public class Exam01 {

	/*
	 * 사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요. 단, 객체지향적으로 코드를 작성합니다.
	 * 
	 * 실행결과1]
	 * 
	 * 하나의 실수를 입력하세요: 3.64
	 * 
	 * 버림 : 3 반올림: 4 올림: 4 ======================================= 실행결과2]
	 * 
	 * 하나의 실수를 입력하세요: 6.2364
	 * 
	 * 버림 : 6 반올림: 6
	 * 
	 */

	void 버림(double 실수) {
		System.out.println("버림: " + (int) 실수);
	}

	void 반올림(double 실수) {
		System.out.println("반올림: " + (int) (실수 + 0.5));
	}

	void 올림(double 실수) {
		System.out.println("올림: " + (int) (실수 + 1));
	}

	public static void main(String[] args) {
		double 실수 = 3.64;
		Exam01 exam01 = new Exam01();
		exam01.버림(실수);
		exam01.반올림(실수);
		exam01.올림(실수);
	}

}