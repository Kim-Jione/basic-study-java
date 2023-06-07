package chap06;

public class Ex06 {

	void noReturn2() {
		System.out.println("첫 번째 문장");
		System.out.println("두 번째 문장");
	}

	void return1() {
		System.out.println("return1() 메서드 호출");
	}

	String return2() {
		System.out.println("return2() 메서드 호출");
		return "호출결과";
	}

	public static void main(String[] args) {
		// Ex05 실행 결과와 동일한 결과를 출력하는 코드를 작성하세요.
		Ex06 test = new Ex06();
		test.noReturn2();
		test.return1();
		test.return2();
		System.out.println("returnValue: " + test.return2());
	}

}