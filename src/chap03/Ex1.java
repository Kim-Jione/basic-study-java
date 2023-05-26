package chap03;

public class Ex1 {

	public static void main(String[] args) {
		int number = 10;
		double score = 12.345;
		String text = Integer.toBinaryString(number);
		 
		System.out.printf("%b %n", 3<1);         // boolean
		System.out.printf("%d %n", number);      // 10진수
		System.out.printf("%o %n", number);      //  8진수
		System.out.printf("%x %n%n", number);    // 16진수	
		System.out.printf("%,d %n", 1000000);    // 10진수 (3자리수마다 ',' 표시)
		System.out.printf("%+d %n", 10);         // 10진수 (부호표시)
		System.out.printf("%+d %n", -10);        // 10진수 (부호표시)
		
		System.out.printf("%f %n", score);       // 부동소수점
		System.out.printf("%e %n%n", score);     // 지수
		
		System.out.printf("%c %n", 65);          // 문자 (Unicode에서 65는 A)
		System.out.printf("%s %n%n", text);      // 문자열 
		
		System.out.printf("[%10d] %n", number);  // 전체 10자리 (우측정렬) 
		System.out.printf("[%-10d] %n", number); // 전체 10자리 (좌측정렬)
		System.out.printf("[%010d] %n", number); // 전체 10자리 (빈공간 0으로 채움)
		System.out.printf("[%10.5f] %n", score); // 전체 10자리, 소수점아래 5자리
	}
}
