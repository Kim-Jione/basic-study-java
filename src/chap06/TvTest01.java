package chap06;

public class TvTest01 {

	public static void main(String[] args) {
		Tv t = null; // Tv�ν��Ͻ��� �����ϱ� ���� �������� t�� null�� �ʱ�ȭ
		t = new Tv();// Tv�ν��Ͻ��� �����Ѵ�.
		t.power();// Tv�� �Ҵ�.
		t.channel = 7;// Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown();// Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
		t.power();// Tv�� ����.

	}
}
