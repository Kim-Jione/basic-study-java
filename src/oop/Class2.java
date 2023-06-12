package oop;

public class Class2 {
	int instanceVar; // 0(자동 초기화)
	static int classVar; // 0(자동 초기화)

	void methodA() {
		int methodVar;
		methodVar = 10;// 메서드 변수는 초기화가 자동으로 되지 않아 값을 저장해야 한다.
		System.out.println("methodVar: " + methodVar);
	}
}
