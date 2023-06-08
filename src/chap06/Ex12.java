package chap06;

public class Ex12 {

	public static void main(String[] args) {
		FloatToInteger2 fti1, fti2;
		double num1 = 3.6, num2 = 3.4;

		fti1 = new FloatToInteger2();
		fti1.setNum(num1);

		fti2 = new FloatToInteger2(num2);
		
		System.out.println("fti1: "+fti1.num);
		System.out.println("fti2: "+fti2.num);
	}
}