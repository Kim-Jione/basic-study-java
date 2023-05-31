package chap04;

public class Ex03 {

	public static void main(String[] args) {
		int total = 0;
//		int i = 0;

//		for (i = 1; i <= 10; i++) { // i = 반복 제어 변수
//			System.out.println("i: " + i + ", total: "+total);
//			total += i;
//		}System.out.println("[for 반복문 이후에도 초기식을 사용하고 싶을 때] i: " + i);//11

		
		for (int i = 1; i <= 10; i++) {
			System.out.println("i: " + i + ", total: "+total);
			total += i;
		}
	}
}
