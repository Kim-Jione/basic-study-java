package chap06;

public class TvTest03 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 길이가 3인 TV배열

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv(); // 붙이는 작업
			tvArr[i].channel = i + 10; // i+10을 각 tvArr[i]에 채널에다가 저장
			System.out.println(tvArr[i].channel);
			System.out.println(tvArr[i]);
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();// 채널이 1씩 증가
			System.out.printf("tvArr[%d].channel = %2d %n", i, tvArr[i].channel);
		}

		for (Tv tv : tvArr) {
			// 새로운 Tv의 인스턴스가 생성되어 기존의 참조하고 있던 인스턴스는 쓰레기 객체가 된다.
			tv = new Tv();
			tv.channel = 10;
			System.out.println(tv);
			System.out.println(tv.channel);

		}

	}
}
