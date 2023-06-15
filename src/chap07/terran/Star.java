package chap07.terran;

interface Repairable {}

public class Star {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marines = new Marine();
		SCV scv = new SCV();

		scv.repair(tank);
//		scv.repair(marines);
	}
}