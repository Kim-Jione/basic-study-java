package chap06;

public class TvTest02 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();

		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		System.out.println("t1�� �ּ�: " + t1);
		System.out.println("t2�� �ּ�: " + t2);

		t2 = t1; // t2�� �ּҰ� ������(��, ���� �ν��Ͻ��� ����Ű�� �ִ�.)

		System.out.println("t1�� �ּ�: " + t1);
		System.out.println("t2�� �ּ�: " + t2);

		t2.channel = 15; // t2�� t1�� ���Ƽ� �ƹ��ų� �����ص� ���� ����� ���´�.
		t1.channelDown();

		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

	}
}
