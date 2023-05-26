package chap03;
class OperatorEx09 {
	public static void main(String args[]) { 
		long a = 1000000 * 1000000; //순환
		long b = 1000000 * 1000000L;//정상

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
