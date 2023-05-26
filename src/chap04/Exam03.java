package chap04;

/*
[ 윤년 계산 프로그램 ]

사용자에게 년도를 입력 받아 윤년 여부를 판단하여 출력하는 코드를 작성하세요.

[실행 결과1]					[실행 결과2]
년도를 입력하세요: 2023			년도를 입력하세요: 2020
입력하신 년도는 평년입니다.			입력하신 년도는 윤년입니다.
==========================================================
[윤년 판단 알고리즘]
1. 4의 배수인 해는 윤년입니다.
2. 100의 배수인 해는 평년입니다.
3.400의 배수인 해는 윤년입니다.

- 최소 4개의 년도는 테스트 해야 합니다.
- 2023: 평년, 2020: 윤년, 1900: 평년, 2000: 윤년
==========================================================
[코드 작성 조건]
1. if...else if...else 구문을 이용하여 문제를 해결하세요.
2. if...else 구문을 이용하여 문제를 해결하세요.

 */
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요: ");
		double year = sc.nextDouble();

//		if (year / 4 == (int) year / 4 && year / 100 != (int) year / 100 ) {
//			System.out.println("입력하신 년도는 윤년입니다.");
//		} else if (year / 100 == (int) year / 100 && year / 400 != (int) year / 400) {
//			System.out.println("입력하신 년도는 평년입니다.");
//		} else if (year / 400 == (int) year / 400) {
//			System.out.println("입력하신 년도는 윤년입니다.");
//		}else {
//			System.out.println("입력하신 년도는 평년입니다.");
//		}
		
		if (year / 4 == (int) year / 4 && year / 100 != (int) year / 100 || year / 400 == (int) year / 400 ) {
			System.out.println("입력하신 년도는 윤년입니다.");
		} else {
			System.out.println("입력하신 년도는 평년입니다.");
		}
	}
}