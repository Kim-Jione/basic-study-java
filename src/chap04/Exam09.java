package chap04;

import java.util.Scanner;

/*
 * 
 */
public class Exam09 {
	public static void main(String[] args) {

		int user, com;
		String userStr = "", comStr = "", result = "졌습니다";
		String intro = "\n\t[가위바위보 게임] \n" + " \n" + " \t 1. 가위 \n" + " \t 2. 바위 \n" + " \t 3. 보 \n" + " \t >>>";
		boolean isWin = false;
		Scanner sc = new Scanner(System.in);
		System.out.print(intro);

		do { // 1. 가위바위보 1회 실행
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

		} while (true);
	}
}