package chap04;

public class Ex10 {

	public static void main(String[] args) {
		// 1 부터 100 까지의 합은 5050입니다. 그렇다면 1 부터 몇 까지의 합이 최초로 1000을 초과하는 값일까요?
		// 그 결과를 계산하여 출력하는 코드를 작성하세요.

//		int total = 0, i = 1;

//		  i가 45일 때 1000을 초과했음에도 i는 1이 추가되기에 1씩 밀리게 된다. 
//		while (total <= 1000) {
//			i++;
//			total += i;
//		}
//		System.out.printf("1 부터 %d 까지의 합은 %d 입니다.", i, total);

//		for (i = 0; total >= 1000; i++) {
//			total += i;
//		}
//		System.out.printf("total: %d", total);
		int num = 0;
		for (int i = 0; i < 10; i++) {
			num += i;
		}
		System.out.println(num);
	}
}