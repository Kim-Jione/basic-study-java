package chap07;

import chap07.package8.Child;

public class Ex6 {
	public static void main(String[] args) {
//		chap07.packageB.Child 클래스의 인스턴스를 생tjd고
//		result 값을 출력하는 코드를 작성하세요. 가장 제한적인 방법으로
		Child child = new Child(10, 20, 30, 40);
		System.out.println("result: " + child.getResult());
	}

}
