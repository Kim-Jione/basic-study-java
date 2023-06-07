package chap06;

public class TimeTest {

	public static void main(String[] args) {
		Time t1, t2, t3;

		t1 = new Time();
		t2 = new Time();
		t3 = new Time();
		t1.setHour(14);
		t1.setMinute(30);
		t1.setSecond(25);
		t2.setHour(9);
		t2.setMinute(52);
		t2.setSecond(33);
		t3.setHour(19);
		t3.setMinute(8);
		t3.setSecond(40);
		System.out.println("time1] " + t1.currentTime());
		System.out.println("time2] " + t2.currentTime());
		System.out.println("time3] " + t3.currentTime());
	}

}
