package chap06;

public class ReturnTest {

	void noReturn1() {
		System.out.println("첫 번째 문장");
		System.out.println("두 번째 문장");
		System.out.println("세 번째 문장");
	}

	void noReturn2() {
		System.out.println("첫 번째 문장");
		System.out.println("두 번째 문장");
		return; // 메서드 실행 종료하기 위함
//		System.out.println("세 번째 문장"); // 메서드는 종료됐기에 오류
	}

	void return1() {
		System.out.println("return1() 메서드 호출");

	}

	String return2() {
		System.out.println("return2() 메서드 호출");
		return "호출결과";
	}

}