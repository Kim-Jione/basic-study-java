package chap06;

public class Ex02 {
	public static void main(String[] args) {
//		String[] fruits = { "���", "����", "�ٳ���", "������", "����" };// ����, ����, �ʱ�ȭ�� �� ����
//		Time[] timeArr = new Time[3];
//		for (int i = 0; i < timeArr.length; i++) {
//			timeArr[i] = new Time();
//		}
//		timeArr[0].setHour(14);
//		timeArr[0].setHour(22);
//		timeArr[0].setHour(12);
//		timeArr[0].setMinute(3);
//		timeArr[0].setMinute(4);
//		timeArr[0].setMinute(2);
//		timeArr[0].setSecond(2);
//		timeArr[0].setSecond(1);
//		timeArr[0].setSecond(3);
//		for (int i = 0; i < timeArr.length; i++) {
//			System.out.printf("time%d] %\n", i + 1, timeArr[i].currentTime);
//		}

//		Time[] timeArr = new Time[3];
//		for (Time time : timeArr) { // �迭�� ����� ���� �б⸸ �� �� ����Ѵ�.
//			System.out.printf("time%d] %\n", time);
//		}

		Time[] timeArr = new Time[3];
		for (int i = 0; i < timeArr.length; i++) {
		    timeArr[i] = new Time();
		}
		timeArr[0].setHour(14);
		timeArr[1].setHour(22);
		timeArr[2].setHour(12);
		timeArr[0].setMinute(3);
		timeArr[1].setMinute(4);
		timeArr[2].setMinute(2);
		timeArr[0].setSecond(2);
		timeArr[1].setSecond(1);
		timeArr[2].setSecond(3);
		for (Time time : timeArr) {
		    System.out.printf("time%d] %s\n", time);
		}
	}

}