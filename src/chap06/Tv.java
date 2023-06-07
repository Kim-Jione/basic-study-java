package chap06;

public class Tv {
	// TV의 속성(Attribute)들, 멤버변수, 필드라고도 한다.
	String color; // tv의 색상 나타낼 멤버변수
	boolean isPower; // tv의 전원상태 (on
	int channel;// tv의 채널을 나타낼 멤버변수

	// 멤버메서드(c언어에서는 함수라고도 함)
	// tv의 전원 켜거나 끄는 기능을 하는 메서드
	public void power() {
		this.isPower = !isPower;
		if (isPower) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
		return; // 메서드는 리턴문을 만나면 그 즉시 종료함.

	}

	// TV채널을 높이는 기능을 하는 메서드
	public void channelUp() {
		// 유효성검사
		if (this.channel < 0) {
			System.out.println("채널에는 음수가 없습니다. 1번 채널로 돌아갑니다.");
			this.channel = 1;
		}

		if (this.channel > 999) {
			System.out.println("더 이상 채널이 없습니다. 1번 채널로 돌아갑니다.");
			this.channel = 1;

		}
		this.channel++;
		return;
	}

	// TV채널을 낮추는 기능을 하는 메서드
	public void channelDown() {
		if (this.channel < 0) {
			System.out.println("채널에는 음수가 없습니다. 1번 채널로 돌아갑니다.");
			this.channel = 1;
		}

		if (this.channel > 999) {
			System.out.println("더 이상 채널이 없습니다. 1번 채널로 돌아갑니다.");
			this.channel = 1;

		}
		this.channel--;

		return;
	}

}
