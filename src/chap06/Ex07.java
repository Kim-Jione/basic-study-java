package chap06;

public class Ex07 {// �������� �޼���� �����ؼ��� �ȵȴ�.

	// ���α׷��� ������ ����ϴ� �޼���
	void printTitle() {
		System.out.println("\t ���� ���� ��� ���α׷�");
	}

	// �Է����� �־��� ���ڸ� count ��ŭ ����ϴ� �޼���
	void printCharacter(char ch, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	// PI ���� ��ȯ�ϴ� �޼���
	double getPi() {
		double pi = 3.141592;
		return pi;
	}

	// �������� �Է����� �޾� ���� ���̸� ����Ͽ� ��ȯ�ϴ� �޼���
	double getCircleArea(int radius) {
		double result;
		result = radius * radius * getPi();
		return result;
	}

	public static void main(String[] args) {
		Ex07 ex07 = new Ex07();
		int radius = 7;
		ex07.printCharacter('*', 35);
		ex07.printTitle();
		ex07.printCharacter('*', 35);
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ�. \n", radius, ex07.getCircleArea(radius));

	}

}