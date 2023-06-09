package chap06;

/*
	아래의 가위바위보 게임의 코드를 이용하여 객체지향 기법을 적용한 코드로 변환하여 작성하세요.
	CLass 2개, 가위바위보, 테스트
*/
import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		// 가위바위보 입력 받는다.
		Scanner sc = new Scanner(System.in);
		KawiBawiBo kbbGame = new KawiBawiBo();
		String intro = "\n\t [ 가위바위보 게임 ] \n" + "\n" + "\t 1. 가위 \n" + "\t 2. 바위 \n" + "\t 3. 보 \n" + "\t >>> ";
		System.out.print(intro);
		kbbGame = new KawiBawiBo(sc.nextInt());

		sc.close();

		System.out.printf("\n\t 사용자: %s , 컴퓨터: %s  \n", kbbGame.getUser(), kbbGame.getCom());
		System.out.printf("\t 가위바위보 결과 ==> %s\n", kbbGame.judge());

	}
}