package chap07;

public class Marine extends Unit {

	Marine(int x, int y) {
		super(x, y);
	}

	@Override
	void move(int x, int y) {

		System.out.println("마린이 " + x + ", " + y + " 위치로 이동합니다.");
	}

	void stimpack() {
		System.out.println("마린이 미쳤어요!");

	}

}
