package chap02;

public class Ex7 {

	public static void main(String[] args) {
		float f = 0.12345678901234567890f;
		double d = 0.12345678901234567890;

		System.out.println("f: " + f);// 0.12345679 -> �ݿø��� �ƴ϶� ������ ���ܼ� 8�� �ƴ� 9�� ���´�. => ���е��� ������
		System.out.println("d: " + d);// 0.12345679 -> 
	}
}
	