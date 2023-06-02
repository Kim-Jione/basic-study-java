package chap06;

public class TimeTestArr {

	public static void main(String[] args) {
		Time[] timeArr;
		timeArr = new Time[3];
		timeArr[0] = new Time();
		timeArr[1] = new Time();
		timeArr[2] = new Time();

		timeArr[0].setHour(14);
		timeArr[0].setMinute(30);
		timeArr[0].setSecond(25);
		timeArr[1].setHour(9);
		timeArr[1].setMinute(52);
		timeArr[1].setSecond(33);
		timeArr[2].setHour(19);
		timeArr[2].setMinute(8);
		timeArr[2].setSecond(40);

		for (int i = 0; i < timeArr.length; i++) {
			System.out.printf("time%d] %s \n", i + 1, timeArr[i].currentTime());
		}
	}

}
