package chap07;

public interface ChildInterface extends ParaentInterface1, ParaentInterface2{
	int num = 10; // static이 붙어 기울어짐
	
	void methodC();
}
