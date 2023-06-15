package chap07;

public interface YourInterface {
	int num = 1234;

	static void staticMethod() {
		System.out.println("staticMethod()");
	}

	default void defaultMethod() {
		System.out.println("staticMethod()");

	}

	void abstractMethod();
}
