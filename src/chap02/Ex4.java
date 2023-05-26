package chap02;

public class Ex4 {

	public static void main(String[] args) {
		int num1 = 1234;
		byte b1 = 100, b2 = 10, b3;
//		b3 = b1 + b2; 오버플로우, 큰놈을 작은놈에게 대입하는건 넘쳐서 안됨
		/*
		 * float f;
		 * f = 3.14f; 정상
		 * f = 3.14; 오류
		 * 
		 * 
		 * */
//		int i = 10000000000; 100억을 저장하려면 int가 아닌 long이 되어야 한다.
		// long l = 10000000000L; 이렇게 해줘야 오류가 안난다. 컴퓨터는 기본적으로 숫자를 int로 인식한다.
	}
}
