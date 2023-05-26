package chap03;

public class Ex3 {

	public static void main(String[] args) {
		byte b1 = 10, b2 = 20, result;

		result = (byte) (b1 + b2);// 위에서는 int 타입을 byte 타입으로 자동 형변환이 되지만 연산을 하게 되면 int로 자동으로 형변환 된다.
		System.out.println("result: " + result);
	}
}
