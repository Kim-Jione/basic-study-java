package chap03;

import java.util.Scanner;

// 1. 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 "합격입니다.", 아니면 "불합격입니다." 값을 출력하는 코드를 작성하세요.
// 2. 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 중 한 과목이라도 80점 미만인 점수가 있으면 "과락인 과목이 존재 합니다.", 
// 아니면 "과락인 과목이 없습니다." 값을 출력하는 코드를 작성하세요.
// 3. 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 "합격입니다.", 아니면 "불합격입니다." 값을 출력하는 코드를 작성하세요.
// 단, AND 연산자는 사용할 수 없습니다.
public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng, math;
		boolean result;
		
		System.out.print("영어와 수학 점수를 입력하세요 >>> ");
		eng = sc.nextInt();
		math = sc.nextInt();
		
//		result = eng >= 80 && math >= 80;
//		System.out.println("exam1] "+(result?"합격입니다.":"불합격입니다."));
//
//		result = eng < 80 || math < 80;
//		System.out.println("exam2] " + (result?"과락인 과목이 존재 합니다.":"과락인 과목이 없습니다."));
//
		result = !(eng < 80 || math < 80);
		System.out.println("exam3] " + (result?"합격입니다.":"불합격입니다."));
	}

}
