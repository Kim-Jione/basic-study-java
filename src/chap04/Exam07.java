package chap04;

import java.util.Scanner;

/*
 * [가위바위보 게임]
사용자가 원할 때까지 가위바위보
 * */
public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;
		String input;
		String userStr = "", comStr = "", result = "졌습니다";
		String intro = "\n\t[가위바위보 게임] \n" + " \n" + " \t 1. 가위 \n" + " \t 2. 바위 \n" + " \t 3. 보 \n" + " \t >>>";
		System.out.print(intro);
		while (true) {

			com = (int) (Math.random() * 3);
			user = sc.nextInt() - 1;

			switch (user) {
			case 0:
				userStr = "가위";
				break;
			case 1:
				userStr = "바위";
				break;
			case 2:
				userStr = "보";
				break;
			}

			switch (com) {
			case 0:
				comStr = "가위";
				break;
			case 1:
				comStr = "바위";
				break;
			case 2:
				comStr = "보";
				break;
			}

			switch (user - com) {
			case 0:
				result = "비겼습니다.";
				break;
			case 1:
			case -2:
				result = "이겼습니다.";
				break;
			case 2:
			case -1:
				result = "졌습니다.";
				break;
			}

			System.out.printf("\n\t 사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
			System.out.printf("\t 가위바위보 결과 ==> %s\n", result);
			sc.nextLine();
			System.out.printf("\n\t 종료하시려면 'q'를 입력하세요: ");
			input = sc.nextLine();
			if (input.length() == 1 && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')) {
				break;
			}
		}
			sc.close();
			System.out.printf("이용해주셔서 감사합니다 ... 다음에 다시 만나요 ...^^");

	}
}