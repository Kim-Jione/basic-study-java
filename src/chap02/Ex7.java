package chap02;

public class Ex7 {

	public static void main(String[] args) {
		float f = 0.12345678901234567890f;
		double d = 0.12345678901234567890;

		System.out.println("f: " + f);// 0.12345679 -> 반올림이 아니라 오차가 생겨서 8이 아닌 9가 나온다. => 정밀도가 떨어짐
		System.out.println("d: " + d);// 0.12345679 -> 
	}
}
	