package chap07;

public final class Child2 extends Parent2{
	String gender;
	Child2(String name, String gender){
		super(name);
		this.gender = gender;
		System.out.println("Child 인스턴스 생성");
	}
	void methodA() {
		System.out.println("Child 클래스 methodA()");
	}
}
