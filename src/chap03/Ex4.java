package chap03;

public class Ex4 {

	public static void main(String[] args) {
		int a = 1000000, b = 2000000;
//		long c = a*b;//int x int는 int다. 그래서 int 안에서 순환하게 되어 있어 엉뚱한 값이 나온다.
		long c = (long)a*b;
		System.out.println("c: "+c);
	}	
}
