package chap06;

import java.util.Scanner;

public class ExamTest01 {

	/*
	 * 사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요. 단, 객체지향적으로 코드를 작성합니다.
	 * 
	 * 실행결과1]
	 * 
	 * 하나의 실수를 입력하세요: 3.64
	 * 
	 * 버림 : 3 반올림: 4 올림: 4 ======================================= 실행결과2]
	 * 
	 * 하나의 실수를 입력하세요: 6.2364
	 * 
	 * 버림 : 6 반올림: 6
	 * 
	 */

	public static void main(String[] args) {
		FloatToInteger floatToInteger = new FloatToInteger();
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("하나의 실수를 입력하세요: ");
		num = sc.nextDouble();
		sc.close();
		floatToInteger.setNum(num);
		System.out.println("버림: " + floatToInteger.floor());
		System.out.println("반올림: " + floatToInteger.round());
		System.out.println("올림: " + floatToInteger.ceil());
	}

}