package chap07;

public class MyLotto {
	private int[] lotto;

	public MyLotto() {
		this.lotto = new int[6];
		this.setLotto();
		this.sortLotto();
	}

	// 1. �ζ� ��ȣ �ߺ� �˻� �޼���
	boolean isUnique(int num) {
		boolean result = true;

		for (int i = 0; i < this.lotto.length; i++) {
			if (this.lotto[i] == num) {
				result = false;
				break;
			}
		}

		return result;
	}

	// 2. �ζ� �迭 �ʱ�ȭ �޼���
	void setLotto() {
		int temp;

		for (int i = 0; i < this.lotto.length;) { // ���⿡ ����x` ������ ������ 6���� �ݺ�, Ȯ��X
			while (true) { // �ߺ����� ���� ������ �ݺ�
				temp = (int) (Math.random() * 45) + 1;

				if (this.isUnique(temp)) {
					lotto[i] = temp;
					i++;
					break;
				}
			}
		}
	}

	void sortLotto() {
		int temp;

		for (int i = 0; i < this.lotto.length - 1; i++) {
			for (int j = i + 1; j < this.lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}

		}
	}

	int[] getLotto() {
		return lotto;
	}

	public String toString() {
		String result = "";
		for (int num : lotto) {
			result += num + " ";
		}
		return result;
	}
}