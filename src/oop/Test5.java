package oop;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("classVar: " + Class2.classVar); // 클래스 변수는 클래스 이름으로 사용 가능하다(인스턴스 생성 생략가능)
		Class2.classVar = 1000;
		System.out.println("classVar: " + Class2.classVar); // 클래스 변수는 클래스 이름으로 사용 가능하다(인스턴스 생성 생략가능)

		Class2 c1, c2;
		c1 = new Class2();
		c2 = new Class2();
		System.out.println("c1.instanceVar: " + c1.instanceVar);
		System.out.println("c2.instanceVar: " + c2.instanceVar);

		c1.instanceVar = 1234;
		c2.instanceVar = 5678;
		System.out.println("c1.instanceVar: " + c1.instanceVar);
		System.out.println("c2.instanceVar: " + c2.instanceVar);
		System.out.println("c1.classVar: " + c1.classVar);
		System.out.println("c2.classVar: " + c2.classVar);
		
		c1.methodA();
	}

}
