package chap07;

public class Dropship extends Unit {

	Dropship(int x, int y) {
		super(x, y);
	}

	@Override
	void move(int x, int y) {
		System.out.println("�������� " + x + ", " + y + " ��ġ�� �̵��մϴ�.");
		this.x=x;
		this.y=y;
	}

	void load() {
		System.out.println("�������� ������ �¿���.");

	}

	void unload() {
		System.out.println("�������� ������ ������.");

	}

}
