package chap02;

class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.println("f: "+f);
		System.out.println("i: "+i);
		System.out.printf("%f%n", f);//�Ǽ��� ������ ��ǻ�Ϳ� ��� ����Ǵ��� �� �� �ִ�.
		System.out.printf("%X%n", i); // 16������ ���
	} // main�� ��
}
