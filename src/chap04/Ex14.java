package chap04;

public class Ex14 {

	public static void main(String[] args) {
		int total = 0;
		int i = 1;

		while (total <= 1000) {
			total += i;
			if (total > 1000) {
				continue;
			}
			i++;
		}
		System.out.printf("1 ���� %d ������ ���� %d �Դϴ�.", i, total);
	}
}