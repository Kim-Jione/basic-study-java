package chap06;

public class TvTest01 {

	public static void main(String[] args) {
		Tv t = null; // Tv인스턴스를 참조하기 위한 참조변수 t를 null로 초기화
		t = new Tv();// Tv인스턴스를 생성한다.
		t.power();// Tv를 켠다.
		t.channel = 7;// Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();// Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		t.power();// Tv를 끈다.

	}
}
