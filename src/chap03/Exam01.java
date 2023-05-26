package chap03;

import java.util.Scanner;
/*
	사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
	
	실행결과1]
	
	하나의 실수를 입력하세요: 3.64
	
	버림 : 3
	반올림: 4
=======================================
	실행결과2]
	
	하나의 실수를 입력하세요: 6.2364
	
	버림 : 6
	반올림: 6

*/
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
	
		System.out.print("하나의 실수를 입력하세요 >>> ");
		num = sc.nextDouble();
		System.out.printf("버림: "+(int)num+"%n");
		System.out.printf("반올림: "+(int)(num+0.5));
		
//		System.out.printf("반올림: %.0f\n", num);
	}

}
