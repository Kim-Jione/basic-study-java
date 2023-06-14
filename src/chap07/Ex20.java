package chap07;

public class Ex20 {
	// ������ ��� ����� �����ϴ� �޼���
	void play(Unit unit) {
		unit.move(200, 200);
		if (unit instanceof Marine) {
			Marine marine = (Marine) unit;
			marine.stimpack();
		}
		if (unit instanceof Tank) {
			Tank tank = (Tank) unit;
			tank.changeMode();
		}
		if (unit instanceof Dropship) {
			Dropship dropship = (Dropship) unit;
			dropship.load();
			dropship.unload();
		}

	}

	public static void main(String[] args) {
		Unit[] units = new Unit[4];
		units[0] = new Marine(10, 20);
		units[1] = new Tank(30, 40);
		units[2] = new Marine(20, 35);
		units[3] = new Dropship(60, 50);

		// play() �޼��带 �̿��� ��� ������ ����ϴ� �ڵ带 �Է��ϼ���.
		Ex20 ex20 = new Ex20();
		for (Unit unit : units) {
			ex20.play(unit);
		}
	}

}
