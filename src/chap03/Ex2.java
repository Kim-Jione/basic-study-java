package chap03;

public class Ex2 {

	public static void main(String[] args) {
		int num1 = 7, num2 = 4, result;
		
		result = 7 + (~num2 + 1);
		System.out.printf("%d + %d = %d \n", num1, num2, result);//실수는 비트연산의 대상이 될 수 없다.
	}
}
