package chap04;

public class Ex12 {

	public static void main(String[] args) {
		int total = 0;
		int i = 1;

//		  while (true) { total += i;
//		  
//		  if (total > 1000) { break; } i++; }

		for (;; i++) {
			total += i;

			if (total > 1000) {
				break;
			}

			System.out.printf("1 ���� %d ������ ���� %d �Դϴ�.\n", i, total);
		}
	}
}