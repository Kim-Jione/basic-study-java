package chap06;

public class TvTest02 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

		System.out.println("t1의 주소: " + t1);
		System.out.println("t2의 주소: " + t2);

		t2 = t1; // t2의 주소값 변경함(즉, 같은 인스턴스를 가르키고 있다.)

		System.out.println("t1의 주소: " + t1);
		System.out.println("t2의 주소: " + t2);

		t2.channel = 15; // t2과 t1이 같아서 아무거나 조작해도 같은 결과가 나온다.
		t1.channelDown();

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

	}
}
