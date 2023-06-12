package oop;

public class Test6 {
	void callByValue(int num) {
		num *= 2;
		System.out.println("callByValue() num: " + num);
	}

	void calllByReference(Time[] arr) {
		// Time Ŭ���� �迭�� �Է����� �޾� ��� Ÿ�� ��ü�� ���� 0�� 0�� 0�ʷ� �ʱ�ȭ�ϴ� �ڵ带 �ۼ��ϼ���.
		System.out.println("\n calllByReference() arr: ");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i].hour = 0;
//			arr[i].minute = 0;
//			arr[i].second = 0;
//			System.out.println(arr[i].getCurrentTime());
//		}
		for (Time time : arr) {
			time.hour = 0;
			time.minute = 0;
			time.second = 0;
			System.out.println(time.getCurrentTime());
		}

	};

	public static void main(String[] args) {
		int num = 4;
		Test6 test6 = new Test6();

		// callByValue(num) �� ȣ���ϴ� ������ �ۼ��ϼ���.
//		System.out.println("[callByValue() �޼��� ȣ�� ��] num: " + num);
//		test6.callByValue(num);
//		System.out.println("[callByValue() �޼��� ȣ�� ��] num: " + num);

		// Time Ŭ���� �迭�� �Է����� �޾� calllByReference() �޼��带 ȣ���ϴ� ������ �ۼ��غ�����.
		Time[] arr = { new Time(), new Time(), new Time() };
		arr[0].hour = 10;
		arr[0].minute = 12;
		arr[0].second = 15;
		arr[1].hour = 12;
		arr[1].minute = 15;
		arr[1].second = 18;
		arr[2].hour = 15;
		arr[2].minute = 18;
		arr[2].second = 20;
		System.out.println("\n [calllByReference() �޼��� ȣ�� ��] arr: ");
		for (Time time : arr) {
			System.out.println(time.getCurrentTime());
		}

		test6.calllByReference(arr);
		System.out.println("\n [calllByReference() �޼��� ȣ�� ��] arr: ");
		for (Time time : arr) {
			System.out.println(time.getCurrentTime());
		}

	}

}
