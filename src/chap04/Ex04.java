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

public class Ex04 {

	public static void main(String[] args) {
		// 1부터 100 사이의 모든 홀수의 값을 더하여 그 결과를 출력하는 코드를 작성하세요.

		int total = 0;

//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				total += i;
//			}
//		}
//		System.out.println("1부터 100 사이의 홀수의 합은 " + total + " 입니다.");

		for (int i = 1; i <= 100; i+=2) {
		total += i;
	}
	System.out.println("1부터 100 사이의 홀수의 합은 " + total + " 입니다.");
	}
}