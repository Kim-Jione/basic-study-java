package chap02;

public class Ex8 {

	public static void main(String[] args) {
		byte b1 = 100, b2;
		int i = 100;
//		b2 = i;//타입이 결정되어 있는 변수가 서로 다르므로 집어넣을 수 없다.
		b2 = (byte)i;//명시적 형변환을 해야 한다.
	}
}
	