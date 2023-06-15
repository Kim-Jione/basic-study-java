package chap07;

import chap02.Ex2;

public class Ex22 implements YourInterface {
	public void abstractMethod() {
		System.out.println("abstractMethod()");
	}

	public static void main(String[] args) {
//		Ex22 ex22 = new Ex22();
		YourInterface your = new Ex22();

//		System.out.println("num: " + ex22.num); // 실행결과: num: 1234
		System.out.println("num: " + YourInterface.num); // 실행결과: num: 1234 현재 코드로 접근하는 것을 권장한다.
		System.out.println("num: " + your.num); // 실행결과: num: 1234 현재 코드로 접근하는 것을 권장한다.

//		ex22.staticMethod(); // 오류 발생, staticMethod 메서드는 레퍼런스로 접근할 수 없다.
		YourInterface.staticMethod(); // 실행결과: staticMethod() staticMethod 메서드는 인터페이스명으로 접근해야 한다.
		
//		ex22.defaultMethod(); // 실행결과: defaultMethod()
		your.defaultMethod(); // 실행결과: defaultMethod()
		
//		ex22.abstractMethod(); // 실행결과: abstractMethod()
		your.abstractMethod(); // 실행결과: abstractMethod()
	}
}
