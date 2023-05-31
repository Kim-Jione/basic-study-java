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
		int year;
		String result = "";

		System.out.println("년도를 입력하세요: ");
		year = sc.nextInt();
		sc.close();

//		if (year % 400 == 0) {// 4의 배수이면서 100의 배수가 아닌 것, 자기와 범위가 좁은 애들까지르는 결함할 수 없ㄷ.ㅏ
//			result="윤년";
//		} else if (year % 100==0) {
//			result="평년";
//		} else if (year % 4== 0) {
//			result="윤년";
//		 }else {
//			result="평년";
//		}
//		System.out.printf("입력하신 %d년은 %s입니다.", year, result);

		if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
			result = "윤년";
		} else {
			result = "평년";
		}
		System.out.printf("입력하신 %d년은 %s입니다.", year, result);
	}
}