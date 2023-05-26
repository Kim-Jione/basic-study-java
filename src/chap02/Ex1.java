package chap02;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * multi-line comment int math_score; // 값이 저장되지 않은 변수는 사용할 수 없다 = 컴파일 오류
		 * math_score = 85;
		 * 
		 * int eng_score = 90;
		 */

		// single-line comment
//		int math_score, eng_score;
//		math_score = 95;
//		eng_score= 80;

//		int math_score = 75, eng_score = 85;
		int math_score, eng_score = 85;
		math_score = 88;

		System.out.println("math_score: " + math_score); // 연산의 결과는 문자열 또는 숫자가 나온다. 문자열 + 숫자는 문자열이다.
		System.out.println("eng_score: " + eng_score);
	}
}
