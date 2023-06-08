package chap06;

public class Ex10 {

	long factorial(int num) {
		long result = 0;
		if (num == 1) {
			result = 1;
		} else {
			result = num * factorial(num - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		Ex10 ex10 = new Ex10();
		System.out.println("ÆÑÅä¸®¾ó = " + ex10.factorial(6));
	}
}