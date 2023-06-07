package chap06;

public class Ex05 {

	public static void main(String[] args) {
		ReturnTest test = new ReturnTest(); // 인스턴스가 생성되야지만 사용가능
		// noReturn() 메서드를 호출하여 실행하는 코드를 작성하세요.
//		test.noReturn1();
		test.noReturn2();
		test.return1();
		test.return2();// 값을 반환하는 호출문이 문자열 "호출결과"로 바뀐다.
		String returnValue = test.return2();
		System.out.println("returnValue: " + returnValue);
	}

}