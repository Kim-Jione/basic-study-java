package chap04;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;	
		System.out.print("문자열을 입력하세요: ");
		input = sc.nextLine();

		sc.close();
		System.out.println();
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
	}
}