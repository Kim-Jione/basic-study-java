package chap02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {// 스캐너를 사용하면 키보드등으로부터 입력받은 값을 활용할 수 있다.
		String student_name;
		int math_score;
		Scanner sc = new Scanner(System.in);// 입력받은 문자열값

		System.out.print("학생 이름을 입력하세요.");
		student_name = sc.next();// 사용자가 정수를 입력할 때까지 대기한다.
		
		System.out.print("수학 점수를 입력하세요.");
		Scanner sc2 = new Scanner(System.in);// 입력받은 정수값
		math_score = sc.nextInt();// 사용자가 정수를 입력할 때까지 대기한다.
		
		System.out.println("학생 이름: " + student_name);
		System.out.println("수학 점수: " + math_score);
		// println은 아래값을 출력하고 대행한다. print는 대행만 한다.
		sc.close();
	}
}
