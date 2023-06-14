package chap07;

public class Dropship extends Unit {

	Dropship(int x, int y) {
		super(x, y);
	}

	@Override
	void move(int x, int y) {
		System.out.println("수성선이 " + x + ", " + y + " 위치로 이동합니다.");

	}

	void load() {
		System.out.println("수성선이 병력을 태워요.");

	}

	void unload() {
		System.out.println("수성선이 병력을 내려요.");

	}

}
