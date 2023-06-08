package chap06;

public class Ex08 {

	void changeParam(int num) {
		num *= 2;
		System.out.println("[chaneParam()] num: " + num);
	}

	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		int num = 1234;
		System.out.println("[메서드 호출 전] num: " + num);

		// chanegeParam() 메서드 호출
		ex08.changeParam(num);
		System.out.println("[메서드 호출 후] num: " + num);
	}

}