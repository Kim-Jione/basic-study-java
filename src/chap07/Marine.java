package chap07;

public class Marine extends Unit {

	Marine(int x, int y) {
		super(x, y);
	}

	@Override
	void move(int x, int y) {

		System.out.println("������ " + x + ", " + y + " ��ġ�� �̵��մϴ�.");
	}

	void stimpack() {
		System.out.println("������ ���ƾ��!");

	}

}
