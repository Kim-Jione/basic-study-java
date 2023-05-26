package chap02;

public class Ex5 {

	public static void main(String[] args) {
//		char ch1 = 'a', ch2 = 98, ch3 = 122;//출력: a, b, z
//		int code1 = ch1, code2 = ch2, code3 = ch3;//출력: 97, 98, 122
		char ch1 = 48, ch2 = 49, ch3 = 57;//출력: 0, 1, 9
		int code1 = ch1, code2 = ch2, code3 = ch3;//출력: 48, 49, 57
//		char ch1 = '부', ch2 = '산', ch3 = '시';
//		int code1 = ch1, code2 = ch2, code3 = ch3;//48512, 49328, 49884
		
		System.out.println("ch1:" + ch1 + ", ch2:" + ch2 + ", ch3:" + ch3);// A
		System.out.println("code1:" + code1 + ", code2:" + code2 + ", code3: " + code3);// 65
	}
}
	