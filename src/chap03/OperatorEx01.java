package chap03;

class OperatorEx01 {
	public static void main(String args[]) {
		int i = 5, result;
//		result = i++; // i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
//		System.out.println("i: " + i + ", result: " + result);// 변수 뒤에 오는 증감연산자를 후위형이라 한다.

		result = ++i; // 결과를 비교하기 위해 i값을 다시 5로 변경.
		System.out.println("i: " + i + ", result: " + result);// 변수 뒤에 오는 증감연산자를 후위형이라 한다.

//		result = i--; // i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
//		System.out.println("i: " + i + ", result: " + result);// 변수 뒤에 오는 증감연산자를 후위형이라 한다.
//
//		result = --i; // i=i+1;과 같은 의미이다. ++i;로 바꿔 써도 결과는 같다.
//		System.out.println("i: " + i + ", result: " + result);// 변수 뒤에 오는 증감연산자를 후위형이라 한다.

	}
}
