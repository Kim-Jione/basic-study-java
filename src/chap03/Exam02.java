package chap03;

import java.util.Scanner;

/*
	[ 동전 교환 프로그램 ]
	
	다음의 실행 결과와 같은 프로그램을 작성하세요.
	
	실행 결과]
	
	계산하실 금액을 입력하세요: 10000
	구매하신 금액을 입력하세요: 6234
	
	거스름 돈: 3766원
	500원 짜리 동전: 7개
	100원 짜리 동전: 2개
	50원 짜리 동전: 1개
	10원 짜리 동전: 1개
	나머지 거스름돈: 6원
	
	코드 작성 조건]
	1. 여러 개의 변수를 이용하여 문제를 해결합니다.
	2. 하나의 변수만 사용하여 문제를 해결합니다.
*/
public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("계산하실 금액을 알려주세요.");
		money = sc.nextInt();
		System.out.println("구매하실 금액을 알려주세요.");
		money -= sc.nextInt(); // 거스름돈
		System.out.printf("\n500원짜리 동전: %d개", money/500);
		money %= 500;
		System.out.printf("\n100원짜리 동전: %d개", money/100);
		money %= 100;
		System.out.printf("\n50원짜리 동전: %d개", money/50);
		money %= 50;
		System.out.printf("\n10원짜리 동전: %d개", money/10);
		money %= 10;
		System.out.printf("\n나머지 돈: %d원", money);
		
				
				
				
				
				
				
				
				
				
				
				
				
				
//		Scanner sc = new Scanner(System.in);
//		int calculation, pay, remain;
//		System.out.print("계산하실 금액을 입력해주세요.");
//		calculation = sc.nextInt();
//		System.out.print("구매하신 금액을 입력해주세요.");
//		pay = sc.nextInt();
//		remain = calculation - pay;
//
//		System.out.printf("거스름 돈: " + remain + "원" + "%n"); // 3766원
//		System.out.printf("500원 짜리 동전: " + remain / 500 + "개" + "%n"); // 7개
//		remain = remain - (remain/500)*500;
//		System.out.printf("100원 짜리 동전: " + remain / 100 + "개" + "%n");
//		remain = remain - (remain/100)*100;
//		System.out.printf("50원 짜리 동전: " + remain / 50 + "개" + "%n");
//		remain = remain - (remain/50)*50;
//		System.out.printf("10원 짜리 동전: " + remain / 10 + "개" + "%n");
//		remain = remain - (remain/10)*10;
//		System.out.printf("나머지 거스름돈: " + remain  + "원");
		
//		Scanner sc = new Scanner(System.in);
//				int money;
//				System.out.print("\n\t계산하실 금액을 입력하세요: ");
//				money = sc.nextInt();
//				
//				System.out.print("\t구매하신 금액을 입력하세요: ");
//				money -= sc.nextInt();
//				sc.close();
//				
//				System.out.printf("\n\t거스름 돈: %d원", money);
//				System.out.printf("\n\t500원짜리 동전: %d개", money/500);
//				
//				money %= 500; // 거스름 돈을 500으로 나눈 후 나머지를 다시 저장
//				System.out.printf("\n\t100원짜리 동전: %d개", money/100);
//				money %= 100; // 거스름 돈을 500으로 나눈 후 나머지를 다시 저장
//				System.out.printf("\n\t50원짜리 동전: %d개", money/50);
//				money %= 50; // 거스름 돈을 500으로 나눈 후 나머지를 다시 저장
//				System.out.printf("\n\t10원짜리 동전: %d개", money/10);
//				money %= 10; // 거스름 돈을 500으로 나눈 후 나머지를 다시 저장
//				System.out.printf("\n\t나머지 거스름돈: %d원", money);
	}

}
