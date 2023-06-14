package chap07;

/*
다음의 배열을 이용하여 중복되지 않는 로또 번호 6개를 생성하여 크기 순서대로 출력하는 코드를 작성하세요.
단, 객체지향적으로 코드를 작성하여야 합니다.
int [] lotto = new int[6];
*/

public class Exam2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45 + 1); // 랜덤 로또번호 생성
			lotto[i] = random; // 배열에 6개의 랜덤 번호 저장
			System.out.println(lotto[i]);
		}
		for (int j = 0; j < lotto.length; j++) {
			if(lotto[j]>lotto[j-1]) {
				
			}
		}
	}
}
