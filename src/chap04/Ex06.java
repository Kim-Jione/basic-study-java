package chap04;

public class Ex06 {

	public static void main(String[] args) {


		for (int i = 0; i<4; i++) {// i가 한 번 반복될 때 j는 전체 반복된다.
			System.out.println("i: "+i);
			
			for(int j=0; j<3; j++) {
				System.out.println("\t j: "+j);
			}
		}

	}
}