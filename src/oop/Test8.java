package oop;

public class Test8 {
	public static void main(String[] args) {
		Class5 c1, c2, c3;
		c1 = new Class5();
		c2 = new Class5();
		c2 = new Class5("손흥민", "male", 31);
		c3 = new Class5("류현진", "male", 37, "독서");// 객체를 직접 출력하면 내부적으로 자동으로 toString 메서드를 호출한다.
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}

}
