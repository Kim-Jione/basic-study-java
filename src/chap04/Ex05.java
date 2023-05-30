package chap04;

public class Ex05 {

	public static void main(String[] args) {
		// 1부터 100 사이의 값 중 홀수의 합과 짝수의 합을 동시에 구하여 그 결과를 출력하는 코드를 작성하세요.

		int iTotal = 0, jTotal = 0;

		for (int i = 1, j = 2; i <= 100 && j <= 100; i += 2, j += 2) {
			iTotal += i;
			jTotal += j;

		}
		System.out.println("1부터 100 사이의 값 중 홀수의 합: " + iTotal);
		System.out.println("1부터 100 사이의 값 중 짝수의 합: " + jTotal);

	}
}