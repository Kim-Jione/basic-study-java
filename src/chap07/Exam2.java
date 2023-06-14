package chap07;

/*
다음의 배열을 이용하여 중복되지 않는 로또 번호 6개를 생성하여 크기 순서대로 출력하는 코드를 작성하세요.
단, 객체지향적으로 코드를 작성하여야 합니다.
int [] lotto = new int[6];
*/

class Lotto {

	void setNumber(int number) {
	}

	void compare(int[] lotto) {

	}
}

public class Exam2 {

	public static void main(String[] args) {
//		Lotto num = new Lotto();
//		int random = (int) (Math.random() * 45 + 1);
//		num.setNumber(null);
//			
//		
//		for (int i = 0; i < lotto.length; i++) {
//			int random = (int) (Math.random() * 45 + 1); // 랜덤 로또번호 생성
//			lotto[i] = random; // 배열에 6개의 랜덤 번호 저장
//			num.setNumber(random);
//			System.out.println(lotto[i]);
//		}
		int[] lotto = new int[6];
		int random = (int) (Math.random() * 45 + 1);
		for (int i = 0; i < lotto.length; i++) {
				for (int k = 0; k < lotto.length; k++) {
					lotto[i] = random;
					if (lotto[i] > lotto[k]) {
						System.out.println(lotto[i]);
					}
	
				}
			}

	}
}
