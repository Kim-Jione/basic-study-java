package chap06;

public class Tv {
	// TV�� �Ӽ�(Attribute)��, �������, �ʵ��� �Ѵ�.
	String color; // tv�� ���� ��Ÿ�� �������
	boolean isPower; // tv�� �������� (on
	int channel;// tv�� ä���� ��Ÿ�� �������

	// ����޼���(c������ �Լ���� ��)
	// tv�� ���� �Ѱų� ���� ����� �ϴ� �޼���
	public void power() {
		this.isPower = !isPower;
		if (isPower) {
			System.out.println("TV�� �������ϴ�.");
		} else {
			System.out.println("TV�� �������ϴ�.");
		}
		return; // �޼���� ���Ϲ��� ������ �� ��� ������.

	}

	// TVä���� ���̴� ����� �ϴ� �޼���
	public void channelUp() {
		// ��ȿ���˻�
		if (this.channel < 0) {
			System.out.println("ä�ο��� ������ �����ϴ�. 1�� ä�η� ���ư��ϴ�.");
			this.channel = 1;
		}

		if (this.channel > 999) {
			System.out.println("�� �̻� ä���� �����ϴ�. 1�� ä�η� ���ư��ϴ�.");
			this.channel = 1;

		}
		this.channel++;
		return;
	}

	// TVä���� ���ߴ� ����� �ϴ� �޼���
	public void channelDown() {
		if (this.channel < 0) {
			System.out.println("ä�ο��� ������ �����ϴ�. 1�� ä�η� ���ư��ϴ�.");
			this.channel = 1;
		}

		if (this.channel > 999) {
			System.out.println("�� �̻� ä���� �����ϴ�. 1�� ä�η� ���ư��ϴ�.");
			this.channel = 1;

		}
		this.channel--;

		return;
	}

}
