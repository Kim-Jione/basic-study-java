package chap04;

public class Ex10 {

	public static void main(String[] args) {
		// 1 ���� 100 ������ ���� 5050�Դϴ�. �׷��ٸ� 1 ���� �� ������ ���� ���ʷ� 1000�� �ʰ��ϴ� ���ϱ��?
		// �� ����� ����Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ���.

//		int total = 0, i = 1;

//		  i�� 45�� �� 1000�� �ʰ��������� i�� 1�� �߰��Ǳ⿡ 1�� �и��� �ȴ�. 
//		while (total <= 1000) {
//			i++;
//			total += i;
//		}
//		System.out.printf("1 ���� %d ������ ���� %d �Դϴ�.", i, total);

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