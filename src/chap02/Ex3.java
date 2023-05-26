package chap02;

public class Ex3 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println("num: " + num);

		num = 123;
		System.out.println("num: " + num);

		// final double PI = 3.141592; final은 한 번만 저장할 수 있다.
		final double PI;
		PI = 3.14;

		System.out.println("PI: " + PI);
		
		System.out.println("PI: " + 3.141592);
	}
}
