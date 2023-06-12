package oop;

public class Test3 {
	public static void main(String[] args) {
//		int[] arr = new int[5];
		Time[] arr = { new Time(), new Time(), new Time(), new Time(), new Time() }; // 선언 + 생성 + 초기화
//		for (int num : arr) {
//			System.out.println(num);
//		}
//		Time[] arr = new Time[5];
//		Time[] arr = new Time[5];
//		arr[0] = new Time();
//		arr[1] = new Time();
//		arr[2] = new Time();
//		arr[3] = new Time();
//		arr[4] = new Time();
		arr[0].hour = 10;
		arr[0].minute = 12;
		arr[0].second = 15;
		arr[1].hour = 12;
		arr[1].minute = 15;
		arr[1].second = 18;
		arr[2].hour = 15;
		arr[2].minute = 18;
		arr[2].second = 20;
		arr[3].hour = 18;
		arr[3].minute = 20;
		arr[3].second = 10;
		arr[4].hour = 20;
		arr[4].minute = 10;
		arr[4].second = 12;

		for (Time time : arr) {
			System.out.println(time.getCurrentTime());
		}
	}

}
