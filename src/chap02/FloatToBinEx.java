package chap02;

class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.println("f: "+f);
		System.out.println("i: "+i);
		System.out.printf("%f%n", f);//실수가 실제로 컴퓨터에 어떻게 저장되는지 알 수 있다.
		System.out.printf("%X%n", i); // 16진수로 출력
	} // main의 끝
}
