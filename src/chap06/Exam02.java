package chap06;

/*
	�Ʒ��� ���������� ������ �ڵ带 �̿��Ͽ� ��ü���� ����� ������ �ڵ�� ��ȯ�Ͽ� �ۼ��ϼ���.
	CLass 2��, ����������, �׽�Ʈ
*/
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		// ���������� �Է� �޴´�.
		Scanner sc = new Scanner(System.in);
		KawiBawiBo kbbGame = new KawiBawiBo();
		String intro = "\n\t [ ���������� ���� ] \n" + "\n" + "\t 1. ���� \n" + "\t 2. ���� \n" + "\t 3. �� \n" + "\t >>> ";
		System.out.print(intro);
		kbbGame = new KawiBawiBo(sc.nextInt());

		sc.close();

		System.out.printf("\n\t �����: %s , ��ǻ��: %s  \n", kbbGame.getUser(), kbbGame.getCom());
		System.out.printf("\t ���������� ��� ==> %s\n", kbbGame.judge());

	}
}