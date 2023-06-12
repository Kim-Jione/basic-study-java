package oop;

public class Child4 extends Parent3 {
	int num2;

	Child4(int num1, int num2) { // 부모의 매개변수가 있는 생성자를 호출하는 방법 -> super() 자식이 생성될 때 부모의 디폴트 생성자를 호출함
		super(num1); // 첫번째 문장이어야 한다.
		this.num2 = 200;
		System.out.println("CHild3 클래스의 인스턴스 생성");
	}

}
