package chap04;

/*
[ 가위바위보 게임]

1. 가위
2. 바위
3. 보
>>> 3

사용자 보, 컴퓨터 가위
가위바위보 결과 ==> 졌습니다.
=========================
[코드 작성 조건]
1. switch 문을 이용하여 문제를 해결하세요.
2. if 문을 이용하여 문제를 해결하세요.

 */

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");

		Scanner sc = new Scanner(System.in);
		int userValue = sc.nextInt();
		int computerValue = (int) (Math.random() * 3 + 1);// 1~3
		System.out.printf(">>> %d\n\n", userValue);

		int 가위 = 1;
		int 바위 = 2;
		int 보 = 3;
//		switch (user) {
//		case 1: {
//			switch (computerRan) {
//			case 1:	
//				System.out.println("사용자 가위, 컴퓨터 가위");
//				System.out.println("가위바위보 결과 ==> 비겼습니다.");
//				break;
//
//			case 2:
//				System.out.println("사용자 가위, 컴퓨터 바위");
//				System.out.println("가위바위보 결과 ==> 졌습니다.");
//				break;
//
//			case 3:
//				System.out.println("사용자 가위, 컴퓨터 보");
//				System.out.println("가위바위보 결과 ==> 이겼습니다.");
//				break;
//
//			}
//		}
//			break;
//		case 2: {
//			switch (computerRan) {
//			case 1:
//				System.out.println("사용자 바위, 컴퓨터 가위");
//				System.out.println("가위바위보 결과 ==> 이겼습니다.");
//				break;
//
//			case 2:
//				System.out.println("사용자 바위, 컴퓨터 바위");
//				System.out.println("가위바위보 결과 ==> 비겼습니다.");
//				break;
//
//			case 3:
//				System.out.println("사용자 바위, 컴퓨터 보");
//				System.out.println("가위바위보 결과 ==> 겼습니다.");
//				break;
//
//			}
//		}
//			break;
//		case 3: {
//			switch (computerRan) {
//			case 1:
//				System.out.println("사용자 보, 컴퓨터 가위");
//				System.out.println("가위바위보 결과 ==> 졌습니다.");
//				break;
//
//			case 2:
//				System.out.println("사용자 보, 컴퓨터 바위");
//				System.out.println("가위바위보 결과 ==> 이겼습니다.");
//				break;
//
//			case 3:
//				System.out.println("사용자 보, 컴퓨터 보");
//				System.out.println("가위바위보 결과 ==> 비겼습니다.");
//				break;
//
//			}
//		}
//			break;
//		}
		if (userValue == 가위 && computerValue == 가위) {
			System.out.println("사용자 가위, 컴퓨터 가위");
			System.out.println("가위바위보 결과 ==> 비겼습니다.");
		}
		if (userValue == 가위 && computerValue == 바위) {
			System.out.println("사용자 가위, 컴퓨터 바위");
			System.out.println("가위바위보 결과 ==> 졌습니다.");

		}
		if (userValue == 가위 && computerValue == 보) {
			System.out.println("사용자 가위, 컴퓨터 보");
			System.out.println("가위바위보 결과 ==> 이겼습니다.");

		}

		if (userValue == 바위 && computerValue == 가위) {
			System.out.println("사용자 바위, 컴퓨터 가위");
			System.out.println("가위바위보 결과 ==> 이겼습니다.");

		}
		if (userValue == 바위 && computerValue == 바위) {
			System.out.println("사용자 바위, 컴퓨터 바위");
			System.out.println("가위바위보 결과 ==> 비겼습니다.");

		}
		if (userValue == 바위 && computerValue == 보) {
			System.out.println("사용자 바위, 컴퓨터 보");
			System.out.println("가위바위보 결과 ==> 겼습니다.");

		}

		if (userValue == 보 && computerValue == 가위) {
			System.out.println("사용자 보, 컴퓨터 가위");
			System.out.println("가위바위보 결과 ==> 졌습니다.");

		}
		if (userValue == 보 && computerValue == 바위) {
			System.out.println("사용자 보, 컴퓨터 바위");
			System.out.println("가위바위보 결과 ==> 이겼습니다.");

		}
		if (userValue == 보 && computerValue == 보) {
			System.out.println("사용자 보, 컴퓨터 보");
			System.out.println("가위바위보 결과 ==> 비겼습니다.");
		} else {
			System.out.println("1, 2, 3중 하나의 숫자를 입력해주세요.");

		}
	}
}