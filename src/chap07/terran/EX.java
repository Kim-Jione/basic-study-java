package chap07.terran;

public class EX {
	public static void main(String[] args) {
		

	Tank tank = new Tank();
	Marine marine = new Marine();
	SCV scv = new SCV();
	scv.repair(tank);
//	scv.repair(marine); // 에러발생
	
	}
}