package chap07.terran;

public class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		this.hitPoint = this.MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Repairable) {
			Unit u = (Unit) r;
		}
	};
}
