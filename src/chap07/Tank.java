package chap07;

public class Tank extends Unit {

	Tank(int x, int y) {
		super(x, y);
	}

	@Override
	void move(int x, int y) {
		System.out.println("��ũ�� " + x + ", " + y + " ��ġ�� �̵��մϴ�.");

	}

	void changeMode() {
		System.out.println("�������� ����!");

	}
}
