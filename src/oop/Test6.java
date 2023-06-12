package oop;

public class Test6 {
	void callByValue(int num) {
		num *= 2;
		System.out.println("callByValue() num: " + num);
	}

	public static void main(String[] args) {
		int num = 4;
		Test6 test6 = new Test6();

		// callByValue(num) 을 호출하는 문장을 작성하세요.
		System.out.println("[callByValue() 메서드 호출 전] num: " + num);
		test6.callByValue(num);
		System.out.println("[callByValue() 메서드 호출 후] num: " + num);
	}

}
