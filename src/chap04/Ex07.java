package chap04;

public class Ex07 {

	public static void main(String[] args) {

		int total = 0;

//		for (int i = 1; i <= 100; i++) {
//			total += i;
//		}
//		System.out.println("1 부터 100까지의 합: " + total);
		
		int i = 1; // 1. 초기식을 뺀다.
		while (i <= 100) {// 3. 조건만 남게 된다.
			total += i;
			i++;// 2. 증감식을 마지막 실행으로 뺀다.
		}
		System.out.println("1 부터 100까지의 합: " + total);

	}
}