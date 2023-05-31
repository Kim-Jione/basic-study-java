package chap04;

/*
	시험 점수는 0점부터 100점 사이의 값이어야 합니다.
	올바른 값이 입력되는 경우에만 학생의 점수를 평가하는 코드를 작성하세요.
 */
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력하세요: ");
		int score = sc.nextInt();
		sc.close();

		String grade = "";
		if (0 <= score && score <= 100) {

			if (score >= 90 && score >= 98) {// 같은 의미는 중첩할 필요가 없다.
				grade += "A+";
			} else if (score >= 90 && score < 94) {
				grade += "A-";
			} else if (score >= 80 && score >= 88) {
				grade += "B+";
			} else if (score >= 80 && score < 84) {
				grade += "B-";
			} else {
				grade = "C";
			}
			System.out.println("당신의 학점은: " + grade);
		} else {
			System.out.println("0부터 100 사이의 올바른 값을 입력하세요.");
		}

	}
}
