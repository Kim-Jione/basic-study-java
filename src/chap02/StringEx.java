package chap02;

class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;

		System.out.println(name);//JAVA
		System.out.println(str);//JAVA8.0
		System.out.println(7 + " ");//7 
		System.out.println(" " + 7);// 7
		System.out.println(7 + "");//7
		System.out.println("" + 7);//7
		System.out.println("" + "");//
		System.out.println(7 + 7 + "");//14
		System.out.println("" + 7 + 7);//77
	}
}
