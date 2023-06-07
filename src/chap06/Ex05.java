package chap06;

public class Ex05 {

	void noReturn() {
		System.out.println("첫 번째 문장");
		System.out.println("두 번째 문장");
		System.out.println("세 번째 문장");
	}

	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		// noReturn() 메서드를 호출하여 실행하는 코드를 작성하세요.
		ex05.noReturn();
	}

}