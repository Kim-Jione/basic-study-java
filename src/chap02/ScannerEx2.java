package chap02;

import java.util.*;    // Scanner를 사용하기 위해 추가

class ScannerEx2 { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int math, eng;
		
		System.out.print("수학, 영어 점수를 입력해 주세요: ");
		math = scanner.nextInt();
		eng = scanner.nextInt();
		System.out.printf("수학점수: %d, 영어점수: %d",math, eng);
		
		scanner.close();
		
//		String input = scanner.nextLine();//사용자가 엔터 입력할 때까지 하나의 문자열로 인식
//		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
//
//		System.out.println("입력내용 :"+input);
//		System.out.printf("num=%d%n", num);
	} 
}
