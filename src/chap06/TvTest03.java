package chap06;

public class TvTest03 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // ���̰� 3�� TV�迭

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv(); // ���̴� �۾�
			tvArr[i].channel = i + 10; // i+10�� �� tvArr[i]�� ä�ο��ٰ� ����
			System.out.println(tvArr[i].channel);
			System.out.println(tvArr[i]);
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();// ä���� 1�� ����
			System.out.printf("tvArr[%d].channel = %2d %n", i, tvArr[i].channel);
		}

		for (Tv tv : tvArr) {
			// ���ο� Tv�� �ν��Ͻ��� �����Ǿ� ������ �����ϰ� �ִ� �ν��Ͻ��� ������ ��ü�� �ȴ�.
			tv = new Tv();
			tv.channel = 10;
			System.out.println(tv);
			System.out.println(tv.channel);

		}

	}
}
